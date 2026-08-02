package Zc0;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements InterfaceC6511n<CheckBoxView, CheckBoxDTO.CheckboxStatus, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7735q f35816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(Function1<? super Boolean, Unit> function1) {
        super(3);
        this.f35816b = (C7735q) function1;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(CheckBoxView checkBoxView, CheckBoxDTO.CheckboxStatus checkboxStatus, Boolean bool) {
        CheckBoxDTO.CheckboxStatus status = checkboxStatus;
        boolean booleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(checkBoxView, "<unused var>");
        Intrinsics.checkNotNullParameter(status, "status");
        if (booleanValue) {
            this.f35816b.invoke(Boolean.valueOf(status == CheckBoxDTO.CheckboxStatus.SELECTED));
        }
        return Unit.f71690a;
    }
}
