package androidx.activity;

import androidx.datastore.core.FileStorage;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OnBackPressedDispatcher onBackPressedDispatcher_delegate$lambda$0;
        Unit createConnection$lambda$1;
        List handshake$lambda$2;
        switch (this.a) {
            case 0:
                onBackPressedDispatcher_delegate$lambda$0 = ComponentDialog.onBackPressedDispatcher_delegate$lambda$0((ComponentDialog) this.b);
                return onBackPressedDispatcher_delegate$lambda$0;
            case 1:
                createConnection$lambda$1 = FileStorage.createConnection$lambda$1((File) this.b);
                return createConnection$lambda$1;
            default:
                handshake$lambda$2 = Handshake.Companion.handshake$lambda$2((List) this.b);
                return handshake$lambda$2;
        }
    }
}
