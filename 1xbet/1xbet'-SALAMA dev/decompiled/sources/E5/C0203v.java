package E5;

import java.util.HashMap;

/* JADX INFO: renamed from: E5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0203v extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2411b;

    public C0203v(String str, String str2, HashMap map) {
        super(str2);
        this.f2410a = str;
        this.f2411b = map;
    }
}
