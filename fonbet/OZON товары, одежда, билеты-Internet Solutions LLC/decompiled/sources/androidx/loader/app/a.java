package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.B0;
import androidx.lifecycle.J;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0801a<D> {
        @NonNull
        androidx.loader.content.b<D> onCreateLoader(int i11, Bundle bundle);

        void onLoadFinished(@NonNull androidx.loader.content.b<D> bVar, D d11);

        void onLoaderReset(@NonNull androidx.loader.content.b<D> bVar);
    }

    @NonNull
    public static <T extends J & B0> a b(@NonNull T t2) {
        return new b(t2, t2.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract androidx.loader.content.b c(@NonNull InterfaceC0801a interfaceC0801a);

    public abstract void d();
}
