package Kl;

import com.google.gson.internal.o;
import com.google.gson.j;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15999a;

    public /* synthetic */ a(Object obj) {
        this.f15999a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f15999a).invoke(obj);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        throw new j((String) this.f15999a);
    }
}
