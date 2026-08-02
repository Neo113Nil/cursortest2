package dev.fluttercommunity.plus.share;

import android.content.Intent;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements PluginRegistry.ActivityResultListener {
    public static final a Companion = new a();
    public MethodChannel.Result a;
    public AtomicBoolean b;

    public static final class a {
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        MethodChannel.Result result;
        if (i != 22643) {
            return false;
        }
        SharePlusPendingIntent.INSTANCE.getClass();
        String str = SharePlusPendingIntent.a;
        if (this.b.compareAndSet(false, true) && (result = this.a) != null) {
            Intrinsics.checkNotNull(result);
            result.success(str);
            this.a = null;
        }
        return true;
    }
}
