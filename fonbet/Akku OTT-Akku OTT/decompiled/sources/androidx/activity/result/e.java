package androidx.activity.result;

import dev.fluttercommunity.workmanager.pigeon.n;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer generateRandomNumber$lambda$0;
        switch (this.a) {
            case 0:
                generateRandomNumber$lambda$0 = ActivityResultRegistry.generateRandomNumber$lambda$0();
                return generateRandomNumber$lambda$0;
            default:
                return new n();
        }
    }
}
