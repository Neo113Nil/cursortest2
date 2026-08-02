package u5;

import G4.C0282o;
import e1.k;
import java.io.File;
import java.util.concurrent.Future;

/* renamed from: u5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1649c {

    /* renamed from: a, reason: collision with root package name */
    public long f16876a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16877b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16878c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16879d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16880e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16881f;

    /* renamed from: g, reason: collision with root package name */
    public Future f16882g;

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) ((C0282o) this.f16879d).f3011c);
        return k.i(sb, File.separator, str);
    }
}
