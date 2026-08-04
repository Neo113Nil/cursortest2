package io.sentry.android.replay.viewhierarchy;

import C6.o;
import Y4.D;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.ComposeTextLayout;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import p044f6.b;
import p050g6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ComposeViewHierarchyNode {
    private static WeakReference<LayoutCoordinates> _rootCoordinates;
    private static boolean semanticsRetrievalErrorLogged;
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();
    private static final b getSemanticsConfigurationMethod$delegate = D.C(ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2.INSTANCE);
    public static final int $stable = 8;

    private ComposeViewHierarchyNode() {
    }

    private final ViewHierarchyNode fromComposeNode(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, int i7, boolean z4, SentryOptions sentryOptions) {
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z4) {
            _rootCoordinates = new WeakReference<>(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference<LayoutCoordinates> weakReference = _rootCoordinates;
        Rect rectBoundsInWindow = NodesKt.boundsInWindow(coordinates, weakReference != null ? weakReference.get() : null);
        try {
            SemanticsConfiguration semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release = retrieveSemanticsConfiguration$sentry_android_replay_release(layoutNode);
            boolean z7 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0;
            boolean z8 = (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsActions.INSTANCE.getSetText())) || (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release == null || !semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release.contains(SemanticsProperties.INSTANCE.getText())) && !z8) {
                Painter painterFindPainter = NodesKt.findPainter(layoutNode);
                if (painterFindPainter == null) {
                    return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i7, viewHierarchyNode, z7 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryOptions), false, z7, rectBoundsInWindow);
                }
                boolean z9 = z7 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, true, sentryOptions);
                if (viewHierarchyNode != null) {
                    viewHierarchyNode.setImportantForCaptureToAncestors(true);
                }
                return new ViewHierarchyNode.ImageViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i7, viewHierarchyNode, z9 && NodesKt.isMaskable(painterFindPainter), true, z7, rectBoundsInWindow);
            }
            boolean z10 = z7 && shouldMask(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, false, sentryOptions);
            if (viewHierarchyNode != null) {
                viewHierarchyNode.setImportantForCaptureToAncestors(true);
            }
            ArrayList arrayList = new ArrayList();
            if (semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfigurationRetrieveSemanticsConfiguration$sentry_android_replay_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            TextAttributes textAttributesFindTextAttributes = NodesKt.findTextAttributes(layoutNode);
            Color colorM23component1QN2ZGVo = textAttributesFindTextAttributes.m23component1QN2ZGVo();
            boolean zComponent2 = textAttributesFindTextAttributes.component2();
            TextLayoutResult textLayoutResult = (TextLayoutResult) h.R0(arrayList);
            Color color = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
            if (color == null || color.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
                colorM23component1QN2ZGVo = color;
            }
            TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
            return new ViewHierarchyNode.TextViewHierarchyNode((textLayoutResult == null || z8 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new ComposeTextLayout(textLayoutResult, zComponent2), colorM23component1QN2ZGVo != null ? Integer.valueOf(ViewsKt.toOpaque(ColorKt.toArgb-8_81llA(colorM23component1QN2ZGVo.unbox-impl()))) : null, 0, 0, rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i7, viewHierarchyNode, z10, true, z7, rectBoundsInWindow, 12, null);
        } catch (Throwable th) {
            if (!semanticsRetrievalErrorLogged) {
                semanticsRetrievalErrorLogged = true;
                sentryOptions.getLogger().log(SentryLevel.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            return new ViewHierarchyNode.GenericViewHierarchyNode(rectBoundsInWindow.left, rectBoundsInWindow.top, layoutNode.getWidth(), layoutNode.getHeight(), viewHierarchyNode != null ? viewHierarchyNode.getElevation() : 0.0f, i7, viewHierarchyNode, true, false, !layoutNode.getOuterCoordinator$ui_release().isTransparent() && rectBoundsInWindow.height() > 0 && rectBoundsInWindow.width() > 0, rectBoundsInWindow);
        }
    }

    private final Method getGetSemanticsConfigurationMethod() {
        return (Method) getSemanticsConfigurationMethod$delegate.getValue();
    }

    private final String getProxyClassName(boolean z4, SemanticsConfiguration semanticsConfiguration) {
        if (z4) {
            return SentryReplayOptions.IMAGE_VIEW_CLASS_NAME;
        }
        return (semanticsConfiguration == null || !(semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText()))) ? "android.view.View" : SentryReplayOptions.TEXT_VIEW_CLASS_NAME;
    }

    private static /* synthetic */ void get_rootCoordinates$annotations() {
    }

    public static final SemanticsConfiguration retrieveSemanticsConfiguration$sentry_android_replay_release(LayoutNode layoutNode) {
        t6.h.e(layoutNode, "node");
        Method getSemanticsConfigurationMethod = INSTANCE.getGetSemanticsConfigurationMethod();
        return getSemanticsConfigurationMethod != null ? (SemanticsConfiguration) getSemanticsConfigurationMethod.invoke(layoutNode, null) : layoutNode.getCollapsedSemantics$ui_release();
    }

    private final boolean shouldMask(SemanticsConfiguration semanticsConfiguration, boolean z4, SentryOptions sentryOptions) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (t6.h.a(str, "unmask")) {
            return false;
        }
        if (t6.h.a(str, "mask")) {
            return true;
        }
        String proxyClassName = getProxyClassName(z4, semanticsConfiguration);
        if (sentryOptions.getSessionReplay().getUnmaskViewClasses().contains(proxyClassName)) {
            return false;
        }
        return sentryOptions.getSessionReplay().getMaskViewClasses().contains(proxyClassName);
    }

    private final void traverse(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, boolean z4, SentryOptions sentryOptions) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i7 = 0; i7 < size; i7++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i7);
            ViewHierarchyNode viewHierarchyNodeFromComposeNode = fromComposeNode(layoutNode2, viewHierarchyNode, i7, z4, sentryOptions);
            if (viewHierarchyNodeFromComposeNode != null) {
                arrayList.add(viewHierarchyNodeFromComposeNode);
                traverse(layoutNode2, viewHierarchyNodeFromComposeNode, false, sentryOptions);
            }
        }
        viewHierarchyNode.setChildren(arrayList);
    }

    public final boolean fromView(View view, ViewHierarchyNode viewHierarchyNode, SentryOptions sentryOptions) {
        t6.h.e(view, "view");
        t6.h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        o.p0(view.getClass().getName(), "AndroidComposeView", false);
        return false;
    }
}
