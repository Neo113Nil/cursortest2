package Wc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

/* loaded from: classes3.dex */
final class o extends AbstractC7737t implements Function1<OtpDTO.HintButton, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f33501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(b bVar) {
        super(1);
        this.f33501b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OtpDTO.HintButton hintButton) {
        OtpDTO.HintButton itemCellDTO = hintButton;
        Intrinsics.checkNotNullParameter(itemCellDTO, "itemCellDTO");
        this.f33501b.I().Y0(itemCellDTO);
        return Unit.f71690a;
    }
}
