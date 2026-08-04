package io.sentry.android.replay.viewhierarchy;

import C6.o;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryOptions;
import io.sentry.android.replay.R;
import io.sentry.android.replay.util.AndroidTextLayout;
import io.sentry.android.replay.util.TextLayout;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import p044f6.d;
import t6.e;
import t6.h;
import t6.i;
import t6.n;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class ViewHierarchyNode {
    private static final String SENTRY_MASK_TAG = "sentry-mask";
    private static final String SENTRY_UNMASK_TAG = "sentry-unmask";
    private List<? extends ViewHierarchyNode> children;
    private final int distance;
    private final float elevation;
    private final int height;
    private boolean isImportantForContentCapture;
    private final boolean isVisible;
    private final ViewHierarchyNode parent;
    private final boolean shouldMask;
    private final Rect visibleRect;
    private final int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f14450x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f14451y;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private final boolean isAssignableFrom(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean isMaskContainer(View view, SentryOptions sentryOptions) {
            String maskViewContainerClass = sentryOptions.getSessionReplay().getMaskViewContainerClass();
            if (maskViewContainerClass == null) {
                return false;
            }
            return view.getClass().getName().equals(maskViewContainerClass);
        }

        private final boolean isUnmaskContainer(ViewParent viewParent, SentryOptions sentryOptions) {
            String unmaskViewContainerClass = sentryOptions.getSessionReplay().getUnmaskViewContainerClass();
            if (unmaskViewContainerClass == null) {
                return false;
            }
            return viewParent.getClass().getName().equals(unmaskViewContainerClass);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:16:0x003c  */
        /* JADX WARN: Code duplicated, block: B:18:0x0041  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code duplicated, block: B:24:0x0062  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068  */
        /* JADX WARN: Code duplicated, block: B:30:0x007d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        private final boolean shouldMask(View view, SentryOptions sentryOptions) {
            String str;
            Class<?> cls;
            Set<String> unmaskViewClasses;
            ViewParent parent;
            String lowerCase;
            Object tag = view.getTag();
            String str2 = tag instanceof String ? (String) tag : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                h.d(lowerCase2, "toLowerCase(...)");
                if (!o.p0(lowerCase2, ViewHierarchyNode.SENTRY_UNMASK_TAG, false)) {
                    if (!h.a(view.getTag(R.id.sentry_privacy), "unmask")) {
                        Object tag2 = view.getTag();
                        str = tag2 instanceof String ? (String) tag2 : null;
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            h.d(lowerCase, "toLowerCase(...)");
                            if (!o.p0(lowerCase, ViewHierarchyNode.SENTRY_MASK_TAG, false)) {
                                if (!h.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                    if (!isMaskContainer(view, sentryOptions) && view.getParent() != null) {
                                        parent = view.getParent();
                                        h.d(parent, "this.parent");
                                        if (isUnmaskContainer(parent, sentryOptions)) {
                                            return false;
                                        }
                                    }
                                    cls = view.getClass();
                                    unmaskViewClasses = sentryOptions.getSessionReplay().getUnmaskViewClasses();
                                    h.d(unmaskViewClasses, "options.sessionReplay.unmaskViewClasses");
                                    if (isAssignableFrom(cls, unmaskViewClasses)) {
                                        return false;
                                    }
                                    Class<?> cls2 = view.getClass();
                                    Set<String> maskViewClasses = sentryOptions.getSessionReplay().getMaskViewClasses();
                                    h.d(maskViewClasses, "options.sessionReplay.maskViewClasses");
                                    return isAssignableFrom(cls2, maskViewClasses);
                                }
                            }
                        } else if (!h.a(view.getTag(R.id.sentry_privacy), "mask")) {
                            if (!isMaskContainer(view, sentryOptions)) {
                                parent = view.getParent();
                                h.d(parent, "this.parent");
                                if (isUnmaskContainer(parent, sentryOptions)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            unmaskViewClasses = sentryOptions.getSessionReplay().getUnmaskViewClasses();
                            h.d(unmaskViewClasses, "options.sessionReplay.unmaskViewClasses");
                            if (isAssignableFrom(cls, unmaskViewClasses)) {
                                return false;
                            }
                            Class<?> cls3 = view.getClass();
                            Set<String> maskViewClasses2 = sentryOptions.getSessionReplay().getMaskViewClasses();
                            h.d(maskViewClasses2, "options.sessionReplay.maskViewClasses");
                            return isAssignableFrom(cls3, maskViewClasses2);
                        }
                        return true;
                    }
                }
            } else if (!h.a(view.getTag(R.id.sentry_privacy), "unmask")) {
                Object tag3 = view.getTag();
                if (tag3 instanceof String) {
                }
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    h.d(lowerCase, "toLowerCase(...)");
                    if (!o.p0(lowerCase, ViewHierarchyNode.SENTRY_MASK_TAG, false)) {
                        if (!h.a(view.getTag(R.id.sentry_privacy), "mask")) {
                            if (!isMaskContainer(view, sentryOptions)) {
                                parent = view.getParent();
                                h.d(parent, "this.parent");
                                if (isUnmaskContainer(parent, sentryOptions)) {
                                    return false;
                                }
                            }
                            cls = view.getClass();
                            unmaskViewClasses = sentryOptions.getSessionReplay().getUnmaskViewClasses();
                            h.d(unmaskViewClasses, "options.sessionReplay.unmaskViewClasses");
                            if (isAssignableFrom(cls, unmaskViewClasses)) {
                                return false;
                            }
                            Class<?> cls4 = view.getClass();
                            Set<String> maskViewClasses3 = sentryOptions.getSessionReplay().getMaskViewClasses();
                            h.d(maskViewClasses3, "options.sessionReplay.maskViewClasses");
                            return isAssignableFrom(cls4, maskViewClasses3);
                        }
                    }
                } else if (!h.a(view.getTag(R.id.sentry_privacy), "mask")) {
                    if (!isMaskContainer(view, sentryOptions)) {
                        parent = view.getParent();
                        h.d(parent, "this.parent");
                        if (isUnmaskContainer(parent, sentryOptions)) {
                            return false;
                        }
                    }
                    cls = view.getClass();
                    unmaskViewClasses = sentryOptions.getSessionReplay().getUnmaskViewClasses();
                    h.d(unmaskViewClasses, "options.sessionReplay.unmaskViewClasses");
                    if (isAssignableFrom(cls, unmaskViewClasses)) {
                        return false;
                    }
                    Class<?> cls5 = view.getClass();
                    Set<String> maskViewClasses4 = sentryOptions.getSessionReplay().getMaskViewClasses();
                    h.d(maskViewClasses4, "options.sessionReplay.maskViewClasses");
                    return isAssignableFrom(cls5, maskViewClasses4);
                }
                return true;
            }
            return false;
        }

        public final ViewHierarchyNode fromView(View view, ViewHierarchyNode viewHierarchyNode, int i7, SentryOptions sentryOptions) {
            Drawable drawable;
            h.e(view, "view");
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            d dVarIsVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean zBooleanValue = ((Boolean) dVarIsVisibleToUser.f13006a).booleanValue();
            Rect rect = (Rect) dVarIsVisibleToUser.f13007b;
            boolean z4 = zBooleanValue && shouldMask(view, sentryOptions);
            if (view instanceof TextView) {
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                TextView textView = (TextView) view;
                Layout layout = textView.getLayout();
                return new TextViewHierarchyNode(layout != null ? new AndroidTextLayout(layout) : null, Integer.valueOf(ViewsKt.toOpaque(textView.getCurrentTextColor())), textView.getTotalPaddingLeft(), ViewsKt.getTotalPaddingTopSafe(textView), textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), textView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4, true, zBooleanValue, rect);
            }
            if (!(view instanceof ImageView)) {
                return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), view.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4, false, zBooleanValue, rect);
            }
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ImageView imageView = (ImageView) view;
            return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, zBooleanValue, rect);
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class GenericViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public /* synthetic */ GenericViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect, int i10, e eVar) {
            this(f7, f8, i7, i8, f9, i9, (i10 & 64) != 0 ? null : viewHierarchyNode, (i10 & 128) != 0 ? false : z4, (i10 & 256) != 0 ? false : z7, (i10 & 512) != 0 ? false : z8, (i10 & 1024) != 0 ? null : rect);
        }

        public GenericViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect) {
            super(f7, f8, i7, i8, f9, i9, viewHierarchyNode, z4, z7, z8, rect, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class ImageViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 0;

        public /* synthetic */ ImageViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect, int i10, e eVar) {
            this(f7, f8, i7, i8, f9, i9, (i10 & 64) != 0 ? null : viewHierarchyNode, (i10 & 128) != 0 ? false : z4, (i10 & 256) != 0 ? false : z7, (i10 & 512) != 0 ? false : z8, (i10 & 1024) != 0 ? null : rect);
        }

        public ImageViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect) {
            super(f7, f8, i7, i8, f9, i9, viewHierarchyNode, z4, z7, z8, rect, null);
        }
    }

    public static final class LCAResult {
        private final ViewHierarchyNode lca;
        private ViewHierarchyNode nodeSubtree;
        private ViewHierarchyNode otherNodeSubtree;

        public LCAResult(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            this.lca = viewHierarchyNode;
            this.nodeSubtree = viewHierarchyNode2;
            this.otherNodeSubtree = viewHierarchyNode3;
        }

        public static /* synthetic */ LCAResult copy$default(LCAResult lCAResult, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                viewHierarchyNode = lCAResult.lca;
            }
            if ((i7 & 2) != 0) {
                viewHierarchyNode2 = lCAResult.nodeSubtree;
            }
            if ((i7 & 4) != 0) {
                viewHierarchyNode3 = lCAResult.otherNodeSubtree;
            }
            return lCAResult.copy(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        public final ViewHierarchyNode component1() {
            return this.lca;
        }

        public final ViewHierarchyNode component2() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode component3() {
            return this.otherNodeSubtree;
        }

        public final LCAResult copy(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2, ViewHierarchyNode viewHierarchyNode3) {
            return new LCAResult(viewHierarchyNode, viewHierarchyNode2, viewHierarchyNode3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LCAResult)) {
                return false;
            }
            LCAResult lCAResult = (LCAResult) obj;
            return h.a(this.lca, lCAResult.lca) && h.a(this.nodeSubtree, lCAResult.nodeSubtree) && h.a(this.otherNodeSubtree, lCAResult.otherNodeSubtree);
        }

        public final ViewHierarchyNode getLca() {
            return this.lca;
        }

        public final ViewHierarchyNode getNodeSubtree() {
            return this.nodeSubtree;
        }

        public final ViewHierarchyNode getOtherNodeSubtree() {
            return this.otherNodeSubtree;
        }

        public int hashCode() {
            ViewHierarchyNode viewHierarchyNode = this.lca;
            int iHashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int iHashCode2 = (iHashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return iHashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
        }

        public final void setNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.nodeSubtree = viewHierarchyNode;
        }

        public final void setOtherNodeSubtree(ViewHierarchyNode viewHierarchyNode) {
            this.otherNodeSubtree = viewHierarchyNode;
        }

        public String toString() {
            return "LCAResult(lca=" + this.lca + ", nodeSubtree=" + this.nodeSubtree + ", otherNodeSubtree=" + this.otherNodeSubtree + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TextViewHierarchyNode extends ViewHierarchyNode {
        public static final int $stable = 8;
        private final Integer dominantColor;
        private final TextLayout layout;
        private final int paddingLeft;
        private final int paddingTop;

        public /* synthetic */ TextViewHierarchyNode(TextLayout textLayout, Integer num, int i7, int i8, float f7, float f8, int i9, int i10, float f9, int i11, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect, int i12, e eVar) {
            this((i12 & 1) != 0 ? null : textLayout, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? 0 : i7, (i12 & 8) != 0 ? 0 : i8, f7, f8, i9, i10, f9, i11, (i12 & 1024) != 0 ? null : viewHierarchyNode, (i12 & 2048) != 0 ? false : z4, (i12 & 4096) != 0 ? false : z7, (i12 & 8192) != 0 ? false : z8, (i12 & 16384) != 0 ? null : rect);
        }

        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        public final TextLayout getLayout() {
            return this.layout;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public TextViewHierarchyNode(TextLayout textLayout, Integer num, int i7, int i8, float f7, float f8, int i9, int i10, float f9, int i11, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect) {
            super(f7, f8, i9, i10, f9, i11, viewHierarchyNode, z4, z7, z8, rect, null);
            this.layout = textLayout;
            this.dominantColor = num;
            this.paddingLeft = i7;
            this.paddingTop = i8;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.ViewHierarchyNode$isObscured$2, reason: invalid class name */
    public static final class AnonymousClass2 extends i implements Function1 {
        final /* synthetic */ n $isObscured;
        final /* synthetic */ ViewHierarchyNode $node;
        final /* synthetic */ ViewHierarchyNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n nVar, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
            super(1);
            this.$isObscured = nVar;
            this.$node = viewHierarchyNode;
            this.this$0 = viewHierarchyNode2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ViewHierarchyNode viewHierarchyNode) {
            h.e(viewHierarchyNode, "otherNode");
            if (viewHierarchyNode.getVisibleRect() == null || this.$isObscured.f16476a) {
                return Boolean.FALSE;
            }
            if (!viewHierarchyNode.isVisible() || !viewHierarchyNode.isImportantForContentCapture() || !viewHierarchyNode.getVisibleRect().contains(this.$node.getVisibleRect())) {
                return Boolean.FALSE;
            }
            if (viewHierarchyNode.getElevation() > this.$node.getElevation()) {
                this.$isObscured.f16476a = true;
                return Boolean.FALSE;
            }
            if (viewHierarchyNode.getElevation() == this.$node.getElevation()) {
                LCAResult lCAResultFindLCA = this.this$0.findLCA(this.$node, viewHierarchyNode);
                ViewHierarchyNode viewHierarchyNodeComponent1 = lCAResultFindLCA.component1();
                ViewHierarchyNode viewHierarchyNodeComponent2 = lCAResultFindLCA.component2();
                ViewHierarchyNode viewHierarchyNodeComponent3 = lCAResultFindLCA.component3();
                if (!h.a(viewHierarchyNodeComponent1, viewHierarchyNode) && viewHierarchyNodeComponent3 != null && viewHierarchyNodeComponent2 != null) {
                    this.$isObscured.f16476a = viewHierarchyNodeComponent3.getDistance() > viewHierarchyNodeComponent2.getDistance();
                    return Boolean.valueOf(!this.$isObscured.f16476a);
                }
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ ViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect, e eVar) {
        this(f7, f8, i7, i8, f9, i9, viewHierarchyNode, z4, z7, z8, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LCAResult findLCA(ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
        ViewHierarchyNode viewHierarchyNode3 = null;
        ViewHierarchyNode viewHierarchyNode4 = equals(viewHierarchyNode) ? this : null;
        ViewHierarchyNode viewHierarchyNode5 = equals(viewHierarchyNode2) ? this : null;
        List<? extends ViewHierarchyNode> list = this.children;
        if (list != null) {
            h.b(list);
            for (ViewHierarchyNode viewHierarchyNode6 : list) {
                LCAResult lCAResultFindLCA = viewHierarchyNode6.findLCA(viewHierarchyNode, viewHierarchyNode2);
                if (lCAResultFindLCA.getLca() != null) {
                    return lCAResultFindLCA;
                }
                if (lCAResultFindLCA.getNodeSubtree() != null) {
                    viewHierarchyNode4 = viewHierarchyNode6;
                }
                if (lCAResultFindLCA.getOtherNodeSubtree() != null) {
                    viewHierarchyNode5 = viewHierarchyNode6;
                }
            }
        }
        if (viewHierarchyNode4 != null && viewHierarchyNode5 != null) {
            viewHierarchyNode3 = this;
        }
        return new LCAResult(viewHierarchyNode3, viewHierarchyNode4, viewHierarchyNode5);
    }

    public final List<ViewHierarchyNode> getChildren() {
        return this.children;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final ViewHierarchyNode getParent() {
        return this.parent;
    }

    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.f14450x;
    }

    public final float getY() {
        return this.f14451y;
    }

    public final boolean isImportantForContentCapture() {
        return this.isImportantForContentCapture;
    }

    public final boolean isObscured(ViewHierarchyNode viewHierarchyNode) {
        h.e(viewHierarchyNode, "node");
        if (this.parent != null) {
            throw new IllegalArgumentException("This method should be called on the root node of the view hierarchy.");
        }
        if (viewHierarchyNode.visibleRect == null) {
            return false;
        }
        n nVar = new n();
        traverse(new AnonymousClass2(nVar, viewHierarchyNode, this));
        return nVar.f16476a;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setChildren(List<? extends ViewHierarchyNode> list) {
        this.children = list;
    }

    public final void setImportantForCaptureToAncestors(boolean z4) {
        for (ViewHierarchyNode viewHierarchyNode = this.parent; viewHierarchyNode != null; viewHierarchyNode = viewHierarchyNode.parent) {
            viewHierarchyNode.isImportantForContentCapture = z4;
        }
    }

    public final void setImportantForContentCapture(boolean z4) {
        this.isImportantForContentCapture = z4;
    }

    public final void traverse(Function1 function1) {
        List<? extends ViewHierarchyNode> list;
        h.e(function1, "callback");
        if (!((Boolean) function1.invoke(this)).booleanValue() || (list = this.children) == null) {
            return;
        }
        h.b(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ViewHierarchyNode) it.next()).traverse(function1);
        }
    }

    private ViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect) {
        this.f14450x = f7;
        this.f14451y = f8;
        this.width = i7;
        this.height = i8;
        this.elevation = f9;
        this.distance = i9;
        this.parent = viewHierarchyNode;
        this.shouldMask = z4;
        this.isImportantForContentCapture = z7;
        this.isVisible = z8;
        this.visibleRect = rect;
    }

    public /* synthetic */ ViewHierarchyNode(float f7, float f8, int i7, int i8, float f9, int i9, ViewHierarchyNode viewHierarchyNode, boolean z4, boolean z7, boolean z8, Rect rect, int i10, e eVar) {
        this(f7, f8, i7, i8, f9, i9, (i10 & 64) != 0 ? null : viewHierarchyNode, (i10 & 128) != 0 ? false : z4, (i10 & 256) != 0 ? false : z7, (i10 & 512) != 0 ? false : z8, (i10 & 1024) != 0 ? null : rect, null);
    }
}
