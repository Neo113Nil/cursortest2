package androidx.activity;

import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.jvm.functions.Function0;
import kotlin.time.AbstractLongTimeSource;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SavedStateViewModelFactory defaultViewModelProviderFactory_delegate$lambda$0;
        long read;
        switch (this.a) {
            case 0:
                defaultViewModelProviderFactory_delegate$lambda$0 = ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0((ComponentActivity) this.b);
                return defaultViewModelProviderFactory_delegate$lambda$0;
            default:
                read = ((AbstractLongTimeSource) this.b).read();
                return Long.valueOf(read);
        }
    }
}
