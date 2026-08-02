package Zc0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$2", f = "PageAgreementWithConditionsFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35832d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f35833e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f35834f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.p f35835g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Jb0.p f35836a;

        public a(n nVar, Jb0.p pVar) {
            this.f35836a = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Rc0.t tVar = (Rc0.t) t2;
            Jb0.p pVar = this.f35836a;
            CheckboxTitleSubtitleCellView termsOfUseCheckbox = pVar.f14529f;
            Intrinsics.checkNotNullExpressionValue(termsOfUseCheckbox, "termsOfUseCheckbox");
            Boolean c11 = tVar.c();
            if (c11 == null) {
                ViewExtKt.gone(termsOfUseCheckbox);
            } else {
                termsOfUseCheckbox.getAddonView().setChecked(c11.booleanValue());
                ViewExtKt.show(termsOfUseCheckbox);
            }
            CheckboxTitleSubtitleCellView adsCheckbox = pVar.f14525b;
            Intrinsics.checkNotNullExpressionValue(adsCheckbox, "adsCheckbox");
            Boolean a11 = tVar.a();
            if (a11 == null) {
                ViewExtKt.gone(adsCheckbox);
            } else {
                adsCheckbox.getAddonView().setChecked(a11.booleanValue());
                ViewExtKt.show(adsCheckbox);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C2406m0 c2406m0, kotlin.coroutines.d dVar, n nVar, Jb0.p pVar) {
        super(2, dVar);
        this.f35833e = c2406m0;
        this.f35834f = nVar;
        this.f35835g = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f35833e, dVar, this.f35834f, this.f35835g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35832d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f35834f, this.f35835g);
            this.f35832d = 1;
            if (this.f35833e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
