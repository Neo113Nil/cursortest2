package androidx.activity;

import androidx.activity.ImmLeaksCleaner;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.C1126a0;
import kotlinx.serialization.internal.S0;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ I(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ImmLeaksCleaner.Cleaner cleaner_delegate$lambda$0;
        switch (this.a) {
            case 0:
                cleaner_delegate$lambda$0 = ImmLeaksCleaner.cleaner_delegate$lambda$0();
                return cleaner_delegate$lambda$0;
            default:
                S0 s0 = S0.a;
                return new C1126a0(s0, s0);
        }
    }
}
