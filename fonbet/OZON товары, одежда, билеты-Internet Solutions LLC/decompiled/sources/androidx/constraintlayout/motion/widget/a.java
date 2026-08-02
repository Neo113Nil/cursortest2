package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    int f41314a = -1;

    /* renamed from: b, reason: collision with root package name */
    int f41315b = -1;

    /* renamed from: c, reason: collision with root package name */
    String f41316c = null;

    /* renamed from: d, reason: collision with root package name */
    HashMap<String, androidx.constraintlayout.widget.a> f41317d;

    public abstract void a(HashMap<String, o2.d> hashMap);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract a clone();

    public a c(a aVar) {
        this.f41314a = aVar.f41314a;
        this.f41315b = aVar.f41315b;
        this.f41316c = aVar.f41316c;
        this.f41317d = aVar.f41317d;
        return this;
    }

    abstract void d(HashSet<String> hashSet);

    abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
