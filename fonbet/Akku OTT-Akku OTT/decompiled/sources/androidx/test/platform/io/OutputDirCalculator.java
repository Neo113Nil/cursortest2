package androidx.test.platform.io;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.RestrictTo;
import androidx.test.platform.app.InstrumentationRegistry;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/test/platform/io/OutputDirCalculator;", "", "()V", "outputDir", "Ljava/io/File;", "getOutputDir", "()Ljava/io/File;", "outputDir$delegate", "Lkotlin/Lazy;", "calculateOutputDir", "third_party.android.androidx_test.runner.monitor.java.androidx.test_monitor"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class OutputDirCalculator {

    /* renamed from: outputDir$delegate, reason: from kotlin metadata */
    private final Lazy outputDir = LazyKt.lazy(new Function0<File>() { // from class: androidx.test.platform.io.OutputDirCalculator$outputDir$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File calculateOutputDir;
            calculateOutputDir = OutputDirCalculator.this.calculateOutputDir();
            return calculateOutputDir;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final File calculateOutputDir() {
        Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String string = InstrumentationRegistry.getArguments().getString("additionalTestOutputDir");
        if (string != null) {
            return new File(string);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            File[] externalMediaDirs = targetContext.getExternalMediaDirs();
            Intrinsics.checkNotNullExpressionValue(externalMediaDirs, "context.externalMediaDirs");
            for (File mediaDir : externalMediaDirs) {
                if (Intrinsics.areEqual(Environment.getExternalStorageState(mediaDir), "mounted")) {
                    Intrinsics.checkNotNullExpressionValue(mediaDir, "mediaDir");
                    return mediaDir;
                }
            }
        }
        if (targetContext.getExternalCacheDir() != null) {
            File externalCacheDir = targetContext.getExternalCacheDir();
            Intrinsics.checkNotNull(externalCacheDir);
            return externalCacheDir;
        }
        File cacheDir = targetContext.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        return cacheDir;
    }

    public final File getOutputDir() {
        return (File) this.outputDir.getValue();
    }
}
