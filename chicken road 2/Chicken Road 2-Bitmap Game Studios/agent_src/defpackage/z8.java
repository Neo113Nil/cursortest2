package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.compose.ui.node.DelegatingNode;
import androidx.window.area.EmptyWindowAreaControllerImpl;
import androidx.window.area.SafeWindowAreaComponentProvider;
import androidx.window.area.WindowAreaController;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.SafeWindowLayoutComponentProvider;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi2;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi6;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi9;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class z8 implements Function0 {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ z8(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        WindowLayoutComponent yzPsTade5rL7D3;
        WindowAreaComponent windowAreaComponent = null;
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                String str = WindowAreaController.yzPsTade5rL7D3;
                try {
                    ClassLoader classLoader = WindowAreaController.Companion.class.getClassLoader();
                    if (classLoader != null) {
                        windowAreaComponent = new SafeWindowAreaComponentProvider(classLoader).yzPsTade5rL7D3();
                    }
                } catch (Throwable unused) {
                    if (BuildConfig.yzPsTade5rL7D3 == VerificationMode.b41X89IqSbKt) {
                        Log.d(WindowAreaController.yzPsTade5rL7D3, "Failed to load WindowExtensions");
                    }
                }
                if (Build.VERSION.SDK_INT <= 29 || windowAreaComponent == null || ExtensionsUtil.yzPsTade5rL7D3() < 3) {
                    return new EmptyWindowAreaControllerImpl();
                }
                WindowAreaControllerImpl windowAreaControllerImpl = new WindowAreaControllerImpl();
                new HashMap();
                return windowAreaControllerImpl;
            case 1:
                Lazy lazy = WindowInfoTracker.Companion.yzPsTade5rL7D3;
                try {
                    ClassLoader classLoader2 = WindowInfoTracker.class.getClassLoader();
                    SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = classLoader2 != null ? new SafeWindowLayoutComponentProvider(classLoader2, new ConsumerAdapter(classLoader2)) : null;
                    if (safeWindowLayoutComponentProvider == null || (yzPsTade5rL7D3 = safeWindowLayoutComponentProvider.yzPsTade5rL7D3()) == null) {
                        return null;
                    }
                    ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader2);
                    int yzPsTade5rL7D32 = ExtensionsUtil.yzPsTade5rL7D3();
                    return yzPsTade5rL7D32 >= 9 ? new ExtensionWindowBackendApi9(yzPsTade5rL7D3, consumerAdapter) : yzPsTade5rL7D32 >= 6 ? new ExtensionWindowBackendApi6(yzPsTade5rL7D3, consumerAdapter) : yzPsTade5rL7D32 >= 2 ? new ExtensionWindowBackendApi2(yzPsTade5rL7D3, consumerAdapter) : yzPsTade5rL7D32 == 1 ? new ExtensionWindowBackendApi1(yzPsTade5rL7D3, consumerAdapter) : new ExtensionWindowBackendApi0();
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
                throw null;
            default:
                throw null;
        }
    }

    public /* synthetic */ z8(DelegatingNode delegatingNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }
}
