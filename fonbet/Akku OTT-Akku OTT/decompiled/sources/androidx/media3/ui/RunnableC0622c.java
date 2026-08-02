package androidx.media3.ui;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.profileinstaller.ProfileInstaller;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import com.facebook.internal.m;

/* renamed from: androidx.media3.ui.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0622c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0622c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((LegacyPlayerControlView) this.b).hide();
                break;
            case 1:
                ProfileInstaller.writeProfile((Context) this.b);
                break;
            case 2:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) this.b);
                break;
            default:
                ((m.a) this.b).a();
                break;
        }
    }
}
