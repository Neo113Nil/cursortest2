package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AutofillId f40827a;

    private a(@NonNull AutofillId autofillId) {
        this.f40827a = autofillId;
    }

    @NonNull
    public static a b(@NonNull AutofillId autofillId) {
        return new a(autofillId);
    }

    @NonNull
    public final AutofillId a() {
        return this.f40827a;
    }
}
