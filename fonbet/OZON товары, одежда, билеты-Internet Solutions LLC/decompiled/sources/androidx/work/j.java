package androidx.work;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f45541a = o.i("InputMerger");

    public static j a(@NonNull String str) {
        try {
            return (j) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e11) {
            o.e().d(f45541a, Nk.a.b("Trouble instantiating + ", str), e11);
            return null;
        }
    }

    @NonNull
    public abstract e b(@NonNull ArrayList arrayList);
}
