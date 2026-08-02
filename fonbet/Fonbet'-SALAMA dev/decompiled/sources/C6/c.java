package C6;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c implements B6.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1588a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1590c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f1591d;

    public c(String str, int i7, int i8, Function2 function2) {
        t6.h.e(str, "input");
        this.f1588a = str;
        this.f1589b = i7;
        this.f1590c = i8;
        this.f1591d = function2;
    }

    @Override // B6.b
    public final Iterator iterator() {
        return new b(this);
    }
}
