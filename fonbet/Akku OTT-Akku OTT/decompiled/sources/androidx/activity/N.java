package androidx.activity;

import android.content.res.Resources;
import androidx.activity.SystemBarStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ N(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean light$lambda$0;
        switch (this.a) {
            case 0:
                light$lambda$0 = SystemBarStyle.Companion.light$lambda$0((Resources) obj);
                return Boolean.valueOf(light$lambda$0);
            default:
                Intrinsics.checkNotNullParameter((kotlinx.serialization.descriptors.a) obj, "<this>");
                return Unit.INSTANCE;
        }
    }
}
