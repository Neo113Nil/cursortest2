package ad0;

import Bc0.l;
import Bc0.m;
import Jb0.q;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import bd0.C5654a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import td0.C9861a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lad0/e;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f36592a;

    public static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f36594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f36594c = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new d(e.this, this.f36594c);
        }
    }

    public e() {
        super(R.layout.fragment_ozon_id_page_notification);
        a aVar = new a(this);
        InterfaceC4008j a11 = k.a(n.NONE, new l(new Bc0.k(this)));
        this.f36592a = b0.b(this, N.b(f.class), new m(a11), new Bc0.n(a11), aVar);
    }

    public static void t(e eVar, EntryDTO.EntryButtonDTO entryButtonDTO) {
        ((f) eVar.f36592a.getValue()).l0(entryButtonDTO);
    }

    public static final void u(e eVar, q qVar, C5654a c5654a) {
        Image userImage = qVar.f14535e;
        Intrinsics.checkNotNullExpressionValue(userImage, "userImage");
        ImageHolderKt.bindOrGone$default(userImage, new ImageDTO(c5654a.a(), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null), null, 2, null);
        TextAtomV2View titleTextAtomView = qVar.f14534d;
        Intrinsics.checkNotNullExpressionValue(titleTextAtomView, "titleTextAtomView");
        OzonSpannableString d11 = c5654a.d();
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextHolderKt.bindOrGone$default(titleTextAtomView, new TextDTO(d11, textAlignment, null, null, null, null, TextPreset.UI_H1, null, null, null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 262076, null), null, 2, null);
        OzonSpannableString c11 = c5654a.c();
        if (c11 == null) {
            return;
        }
        OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
        Context context = eVar.getContext();
        Integer valueOf = context != null ? Integer.valueOf(context.getColor(R.color.text_action)) : null;
        C4998a c4998a = new C4998a(1, (f) eVar.f36592a.getValue(), f.class, "onSubtitleClick", "onSubtitleClick(Ljava/lang/String;)V", 0);
        TextAtomV2View descriptionTextAtomView = qVar.f14532b;
        OzonUrlSpan.Companion.configUrlSpans$default(companion, c11, null, valueOf, null, new Pair(descriptionTextAtomView, c4998a), 5, null);
        Intrinsics.checkNotNullExpressionValue(descriptionTextAtomView, "descriptionTextAtomView");
        TextHolderKt.bind$default(descriptionTextAtomView, new TextDTO(c11, textAlignment, null, null, null, null, TextPreset.PARAGRAPH_COMPACT, null, UniColors.TEXT_SECONDARY.getToken(), Integer.MAX_VALUE, null, null, null, OzonSpannableStringKt.hasClickableSpan(c11), null, null, null, null, null, 515260, null), null, 2, null);
        EntryDTO.EntryButtonDTO b11 = c5654a.b();
        if (b11 == null) {
            return;
        }
        ButtonV3DTO buttonV3DTO = new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, b11.getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262137, null);
        ButtonV3View buttonV3View = qVar.f14533c;
        ButtonV3HolderKt.bindOrGone$default(buttonV3View, buttonV3DTO, null, 2, null);
        C9861a.a(buttonV3View, "submitButton");
        buttonV3View.setOnClickListener(new Hx.b(2, eVar, b11));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        q a11 = q.a(view);
        f fVar = (f) this.f36592a.getValue();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new b(viewLifecycleOwner, null, fVar, this, a11), 3);
    }
}
