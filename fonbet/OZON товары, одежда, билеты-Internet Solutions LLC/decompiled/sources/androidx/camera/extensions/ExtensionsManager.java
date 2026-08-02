package androidx.camera.extensions;

import C.InterfaceC2696p;
import C.S;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.b;

/* loaded from: classes8.dex */
public final class ExtensionsManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f38476a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static ExtensionsManager f38477b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$1, reason: invalid class name */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ InterfaceC2696p val$cameraProvider;
        final /* synthetic */ b.a val$completer;

        AnonymousClass1(b.a aVar, InterfaceC2696p interfaceC2696p) {
            this.val$completer = aVar;
            this.val$cameraProvider = interfaceC2696p;
        }

        public void onFailure(int i11) {
            S.c("ExtensionsManager", "Failed to initialize extensions");
            b.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.c(ExtensionsManager.a());
        }

        public void onSuccess() {
            S.a("ExtensionsManager", "Successfully initialized extensions");
            b.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            aVar.c(ExtensionsManager.a());
        }
    }

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ b.a val$completer;

        AnonymousClass2(b.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i11) {
            this.val$completer.e(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.c(null);
        }
    }

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    static ExtensionsManager a() {
        synchronized (f38476a) {
            try {
                ExtensionsManager extensionsManager = f38477b;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager();
                f38477b = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
