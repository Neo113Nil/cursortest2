package androidx.test.internal.platform.app;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.test.platform.app.InstrumentationRegistry;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface ActivityInvoker {

    /* renamed from: androidx.test.internal.platform.app.ActivityInvoker$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Intent $default$getIntentForActivity(ActivityInvoker activityInvoker, Class cls) {
            Intent makeMainActivity = Intent.makeMainActivity(new ComponentName(InstrumentationRegistry.getInstrumentation().getTargetContext(), (Class<?>) cls));
            return InstrumentationRegistry.getInstrumentation().getTargetContext().getPackageManager().resolveActivity(makeMainActivity, 0) != null ? makeMainActivity : Intent.makeMainActivity(new ComponentName(InstrumentationRegistry.getInstrumentation().getContext(), (Class<?>) cls));
        }
    }

    void finishActivity(Activity activity);

    Instrumentation.ActivityResult getActivityResult();

    Intent getIntentForActivity(Class<? extends Activity> cls);

    void pauseActivity(Activity activity);

    void recreateActivity(Activity activity);

    void resumeActivity(Activity activity);

    void startActivity(Intent intent);

    void startActivity(Intent intent, @Nullable Bundle bundle);

    void startActivityForResult(Intent intent);

    void startActivityForResult(Intent intent, @Nullable Bundle bundle);

    void stopActivity(Activity activity);
}
