package androidx.datastore.preferences;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List preferencesDataStore$lambda$0;
        preferencesDataStore$lambda$0 = PreferenceDataStoreDelegateKt.preferencesDataStore$lambda$0((Context) obj);
        return preferencesDataStore$lambda$0;
    }
}
