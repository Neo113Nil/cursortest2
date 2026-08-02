package OL;

import android.view.View;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f20136b;

    public /* synthetic */ a(View view, int i11) {
        this.f20135a = i11;
        this.f20136b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20135a) {
            case 0:
                ViewExtKt.gone(this.f20136b);
                break;
            default:
                NewCredentialsViewHolder.keyboardUp$lambda$9(this.f20136b);
                break;
        }
    }
}
