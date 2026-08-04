package w0;

import D6.C;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.functions.Function2;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f17268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f17269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, p065i6.d dVar2) {
        super(2, dVar2);
        this.f17267b = dVar;
        this.f17268c = uri;
        this.f17269d = inputEvent;
    }

    @Override // p077k6.a
    public final p065i6.d create(Object obj, p065i6.d dVar) {
        return new b(this.f17267b, this.f17268c, this.f17269d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C) obj, (p065i6.d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14648a;
        int i7 = this.f17266a;
        if (i7 == 0) {
            p003a.a.p0(obj);
            p166y0.b bVar = this.f17267b.f17273a;
            this.f17266a = 1;
            if (bVar.c(this.f17268c, this.f17269d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p003a.a.p0(obj);
        }
        return p044f6.i.f13014a;
    }
}
