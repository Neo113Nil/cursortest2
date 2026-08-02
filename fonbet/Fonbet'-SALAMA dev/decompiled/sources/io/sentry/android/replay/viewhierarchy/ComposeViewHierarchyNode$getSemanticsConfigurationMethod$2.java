package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Method;
import s6.a;
import t6.i;

/* loaded from: classes2.dex */
public final class ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2 extends i implements a {
    public static final ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2 INSTANCE = new ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2();

    public ComposeViewHierarchyNode$getSemanticsConfigurationMethod$2() {
        super(0);
    }

    @Override // s6.a
    public final Method invoke() {
        try {
            Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
