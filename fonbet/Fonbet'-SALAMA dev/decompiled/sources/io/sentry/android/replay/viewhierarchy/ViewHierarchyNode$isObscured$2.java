package io.sentry.android.replay.viewhierarchy;

import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;
import t6.n;

/* loaded from: classes2.dex */
public final class ViewHierarchyNode$isObscured$2 extends i implements Function1 {
    final /* synthetic */ n $isObscured;
    final /* synthetic */ ViewHierarchyNode $node;
    final /* synthetic */ ViewHierarchyNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHierarchyNode$isObscured$2(n nVar, ViewHierarchyNode viewHierarchyNode, ViewHierarchyNode viewHierarchyNode2) {
        super(1);
        this.$isObscured = nVar;
        this.$node = viewHierarchyNode;
        this.this$0 = viewHierarchyNode2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewHierarchyNode viewHierarchyNode) {
        ViewHierarchyNode.LCAResult findLCA;
        h.e(viewHierarchyNode, "otherNode");
        if (viewHierarchyNode.getVisibleRect() == null || this.$isObscured.f16470a) {
            return Boolean.FALSE;
        }
        if (!viewHierarchyNode.isVisible() || !viewHierarchyNode.isImportantForContentCapture() || !viewHierarchyNode.getVisibleRect().contains(this.$node.getVisibleRect())) {
            return Boolean.FALSE;
        }
        if (viewHierarchyNode.getElevation() > this.$node.getElevation()) {
            this.$isObscured.f16470a = true;
            return Boolean.FALSE;
        }
        if (viewHierarchyNode.getElevation() == this.$node.getElevation()) {
            findLCA = this.this$0.findLCA(this.$node, viewHierarchyNode);
            ViewHierarchyNode component1 = findLCA.component1();
            ViewHierarchyNode component2 = findLCA.component2();
            ViewHierarchyNode component3 = findLCA.component3();
            if (!h.a(component1, viewHierarchyNode) && component3 != null && component2 != null) {
                this.$isObscured.f16470a = component3.getDistance() > component2.getDistance();
                return Boolean.valueOf(!this.$isObscured.f16470a);
            }
        }
        return Boolean.TRUE;
    }
}
