package com.google.firebase.datastorage;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SessionData;
import com.google.firebase.sessions.SessionDataSerializer;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List dataStore_delegate$lambda$1;
        SessionData sessionDataStore$lambda$3;
        switch (this.a) {
            case 0:
                dataStore_delegate$lambda$1 = JavaDataStorage.dataStore_delegate$lambda$1((JavaDataStorage) this.b, (Context) obj);
                return dataStore_delegate$lambda$1;
            default:
                sessionDataStore$lambda$3 = FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3((SessionDataSerializer) this.b, (CorruptionException) obj);
                return sessionDataStore$lambda$3;
        }
    }
}
