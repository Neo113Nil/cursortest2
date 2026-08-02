package am0;

import Sc.s;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.notification.NotificationController$downloadImage$2", f = "NotificationController.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends j implements Function2<M, kotlin.coroutines.d<? super Bitmap>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public int f36850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f36851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f36851e = eVar;
        this.f36852f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f36851e, this.f36852f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Bitmap> dVar) {
        return new c(this.f36851e, this.f36852f, dVar).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36850d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        nb.c cVar = this.f36851e.f36861d;
        this.f36850d = 1;
        Object b11 = cVar.b(this.f36852f, this);
        return b11 == aVar ? aVar : b11;
    }
}
