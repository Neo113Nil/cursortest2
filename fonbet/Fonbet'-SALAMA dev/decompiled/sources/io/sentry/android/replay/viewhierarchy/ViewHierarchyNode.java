package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.C1111d;
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
import t6.e;
import t6.h;
import t6.n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
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

    /* renamed from: x, reason: collision with root package name */
    private final float f14444x;

    /* renamed from: y, reason: collision with root package name */
    private final float f14445y;
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

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            if (C6.o.p0(r0, io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.SENTRY_MASK_TAG, false) == true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        
            if (C6.o.p0(r0, io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.SENTRY_UNMASK_TAG, false) == true) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final boolean shouldMask(View view, SentryOptions sentryOptions) {
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                h.d(lowerCase, "toLowerCase(...)");
            }
            if (!h.a(view.getTag(R.id.sentry_privacy), "unmask")) {
                Object tag2 = view.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    h.d(lowerCase2, "toLowerCase(...)");
                }
                if (!h.a(view.getTag(R.id.sentry_privacy), "mask")) {
                    if (!isMaskContainer(view, sentryOptions) && view.getParent() != null) {
                        ViewParent parent = view.getParent();
                        h.d(parent, "this.parent");
                        if (isUnmaskContainer(parent, sentryOptions)) {
                            return false;
                        }
                    }
                    Class<?> cls = view.getClass();
                    Set<String> unmaskViewClasses = sentryOptions.getSessionReplay().getUnmaskViewClasses();
                    h.d(unmaskViewClasses, "options.sessionReplay.unmaskViewClasses");
                    if (isAssignableFrom(cls, unmaskViewClasses)) {
                        return false;
                    }
                    Class<?> cls2 = view.getClass();
                    Set<String> maskViewClasses = sentryOptions.getSessionReplay().getMaskViewClasses();
                    h.d(maskViewClasses, "options.sessionReplay.maskViewClasses");
                    return isAssignableFrom(cls2, maskViewClasses);
                }
                return true;
            }
            return false;
        }

        public final ViewHierarchyNode fromView(View view, ViewHierarchyNode viewHierarchyNode, int i7, SentryOptions sentryOptions) {
            Drawable drawable;
            h.e(view, "view");
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            C1111d isVisibleToUser = ViewsKt.isVisibleToUser(view);
            boolean booleanValue = ((Boolean) isVisibleToUser.f13000a).booleanValue();
            Rect rect = (Rect) isVisibleToUser.f13001b;
            boolean z4 = booleanValue && shouldMask(view, sentryOptions);
            if (view instanceof TextView) {
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                TextView textView = (TextView) view;
                Layout layout = textView.getLayout();
                return new TextViewHierarchyNode(layout != null ? new AndroidTextLayout(layout) : null, Integer.valueOf(ViewsKt.toOpaque(textView.getCurrentTextColor())), textView.getTotalPaddingLeft(), ViewsKt.getTotalPaddingTopSafe(textView), textView.getX(), textView.getY(), textView.getWidth(), textView.getHeight(), textView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4, true, booleanValue, rect);
            }
            if (!(view instanceof ImageView)) {
                return new GenericViewHierarchyNode(view.getX(), view.getY(), view.getWidth(), view.getHeight(), view.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4, false, booleanValue, rect);
            }
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ImageView imageView = (ImageView) view;
            return new ImageViewHierarchyNode(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), imageView.getElevation() + (viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f), i7, viewHierarchyNode, z4 && (drawable = imageView.getDrawable()) != null && ViewsKt.isMaskable(drawable), true, booleanValue, rect);
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
            int hashCode = (viewHierarchyNode == null ? 0 : viewHierarchyNode.hashCode()) * 31;
            ViewHierarchyNode viewHierarchyNode2 = this.nodeSubtree;
            int hashCode2 = (hashCode + (viewHierarchyNode2 == null ? 0 : viewHierarchyNode2.hashCode())) * 31;
            ViewHierarchyNode viewHierarchyNode3 = this.otherNodeSubtree;
            return hashCode2 + (viewHierarchyNode3 != null ? viewHierarchyNode3.hashCode() : 0);
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
                LCAResult findLCA = viewHierarchyNode6.findLCA(viewHierarchyNode, viewHierarchyNode2);
                if (findLCA.getLca() != null) {
                    return findLCA;
                }
                if (findLCA.getNodeSubtree() != null) {
                    viewHierarchyNode4 = viewHierarchyNode6;
                }
                if (findLCA.getOtherNodeSubtree() != null) {
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
        return this.f14444x;
    }

    public final float getY() {
        return this.f14445y;
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
        traverse(new ViewHierarchyNode$isObscured$2(nVar, viewHierarchyNode, this));
        return nVar.f16470a;
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
        this.f14444x = f7;
        this.f14445y = f8;
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
