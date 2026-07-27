package androidx.compose.ui.focus;

import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusModifier;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusModifier;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m1324searchBeyondBoundsOMvw8(FocusModifier searchBeyondBounds, int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int m3107getBeforehoxUOeE;
        Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
        Intrinsics.checkNotNullParameter(block, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent();
        if (beyondBoundsLayoutParent == null) {
            return null;
        }
        if (FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1341getUpdhqQ8s())) {
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3105getAbovehoxUOeE();
        } else if (FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1334getDowndhqQ8s())) {
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3108getBelowhoxUOeE();
        } else if (FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1336getLeftdhqQ8s())) {
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3109getLefthoxUOeE();
        } else if (FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1340getRightdhqQ8s())) {
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3110getRighthoxUOeE();
        } else if (FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1337getNextdhqQ8s())) {
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3106getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m1328equalsimpl0(i, FocusDirection.INSTANCE.m1339getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            m3107getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m3107getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo530layouto7g1Pn8(m3107getBeforehoxUOeE, block);
    }
}
