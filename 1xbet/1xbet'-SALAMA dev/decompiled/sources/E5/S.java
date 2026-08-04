package E5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f2325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f2326d;

    public static S a(ArrayList arrayList) {
        S s7 = new S();
        s7.f2323a = (String) arrayList.get(0);
        s7.f2324b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
        }
        s7.f2325c = bool;
        Boolean bool2 = (Boolean) arrayList.get(3);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }
        s7.f2326d = bool2;
        return s7;
    }
}
