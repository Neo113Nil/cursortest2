package B2;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f2187a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        final InputContentInfo f2188a;

        a(@NonNull InputContentInfo inputContentInfo) {
            this.f2188a = inputContentInfo;
        }
    }

    private d(@NonNull a aVar) {
        this.f2187a = aVar;
    }

    public static d f(InputContentInfo inputContentInfo) {
        if (inputContentInfo == null) {
            return null;
        }
        return new d(new a(inputContentInfo));
    }

    @NonNull
    public final Uri a() {
        return this.f2187a.f2188a.getContentUri();
    }

    @NonNull
    public final ClipDescription b() {
        return this.f2187a.f2188a.getDescription();
    }

    public final Uri c() {
        return this.f2187a.f2188a.getLinkUri();
    }

    public final void d() {
        this.f2187a.f2188a.requestPermission();
    }

    public final Object e() {
        return this.f2187a.f2188a;
    }
}
