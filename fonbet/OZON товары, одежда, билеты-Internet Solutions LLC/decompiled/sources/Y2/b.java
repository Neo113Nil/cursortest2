package Y2;

import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.emoji2.text.v;

/* loaded from: classes8.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f34538a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f34539b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f34540c;

    public static Editable.Factory getInstance() {
        if (f34539b == null) {
            synchronized (f34538a) {
                try {
                    if (f34539b == null) {
                        b bVar = new b();
                        try {
                            f34540c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        f34539b = bVar;
                    }
                } finally {
                }
            }
        }
        return f34539b;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f34540c;
        return cls != null ? v.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
