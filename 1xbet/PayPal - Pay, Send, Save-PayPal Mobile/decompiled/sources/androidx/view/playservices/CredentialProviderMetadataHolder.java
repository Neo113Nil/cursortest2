package androidx.view.playservices;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\tR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$LocalBinder;", "getHighSpeedVideoFpsRanges", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder$LocalBinder;", "getHighSpeedVideoSizes", "LocalBinder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CredentialProviderMetadataHolder extends android.app.Service {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.credentials.playservices.CredentialProviderMetadataHolder.LocalBinder getHighSpeedVideoSizes = new androidx.credentials.playservices.CredentialProviderMetadataHolder.LocalBinder();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderMetadataHolder$LocalBinder;", "Landroid/os/Binder;", "<init>", "(Landroidx/credentials/playservices/CredentialProviderMetadataHolder;)V", "Landroidx/credentials/playservices/CredentialProviderMetadataHolder;", "getService", "()Landroidx/credentials/playservices/CredentialProviderMetadataHolder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class LocalBinder extends android.os.Binder {
        public LocalBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final androidx.view.playservices.CredentialProviderMetadataHolder getGetHighSpeedVideoFpsRangesFor() {
            return androidx.view.playservices.CredentialProviderMetadataHolder.this;
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return this.getHighSpeedVideoSizes;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
