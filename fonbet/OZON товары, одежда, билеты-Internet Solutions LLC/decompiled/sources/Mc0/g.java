package Mc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.C3385c;
import Nc0.n;
import Sc.o;
import Sc.s;
import android.text.TextUtils;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.main.activity.AuthFlowActivity$observeViewModel$lambda$14$lambda$11$$inlined$collectFlow$4", f = "AuthFlowActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f17861d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f17862e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AuthFlowActivity f17863f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3385c f17864g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AuthFlowActivity f17865a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3385c f17866b;

        public a(AuthFlowActivity authFlowActivity, C3385c c3385c) {
            this.f17865a = authFlowActivity;
            this.f17866b = c3385c;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            String a11;
            n.a aVar = (n.a) t2;
            int i11 = AuthFlowActivity.f97290u;
            AuthFlowActivity authFlowActivity = this.f17865a;
            if (aVar instanceof n.a.c) {
                a11 = null;
            } else if (aVar instanceof n.a.b) {
                a11 = authFlowActivity.getString(R.string.ozonid_web_webview_title);
            } else {
                if (!(aVar instanceof n.a.C0373a)) {
                    throw new o();
                }
                a11 = ((n.a.C0373a) aVar).a();
            }
            TextDTO textDTO = a11 != null ? new TextDTO(OzonSpannableStringKt.toOzonSpannableString(a11), TextDTO.TextAlignment.LEADING, null, null, null, null, TextPreset.f97931H2, null, null, Integer.MAX_VALUE, null, null, null, false, null, null, null, null, null, 523708, null) : null;
            TextAtomV2View toolbarTitle = this.f17866b.f14407h;
            Intrinsics.checkNotNullExpressionValue(toolbarTitle, "toolbarTitle");
            TextHolderKt.bindOrGone$default(toolbarTitle, textDTO, null, 2, null);
            toolbarTitle.setMaxLines(1);
            toolbarTitle.setEllipsize(TextUtils.TruncateAt.END);
            toolbarTitle.setSingleLine();
            toolbarTitle.setPadding(toolbarTitle.getPaddingLeft(), 0, toolbarTitle.getPaddingRight(), 0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, AuthFlowActivity authFlowActivity, C3385c c3385c) {
        super(2, dVar);
        this.f17862e = interfaceC2395h;
        this.f17863f = authFlowActivity;
        this.f17864g = c3385c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f17862e, dVar, this.f17863f, this.f17864g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f17861d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f17863f, this.f17864g);
            this.f17861d = 1;
            if (this.f17862e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
