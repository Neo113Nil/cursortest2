package androidx.activity;

import androidx.navigationevent.DirectNavigationEventInput;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DirectNavigationEventInput onBackPressedInput_delegate$lambda$0;
        List list;
        switch (this.a) {
            case 0:
                onBackPressedInput_delegate$lambda$0 = ComponentDialog.onBackPressedInput_delegate$lambda$0((ComponentDialog) this.b);
                return onBackPressedInput_delegate$lambda$0;
            default:
                list = Handshake.Companion.get$lambda$3((List) this.b);
                return list;
        }
    }
}
