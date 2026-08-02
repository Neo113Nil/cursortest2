package com.google.firebase.iid.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* loaded from: classes4.dex */
public interface FirebaseInstanceIdInternal {

    public interface NewTokenListener {
        void onNewToken(String str);
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    void deleteToken(@NonNull String str, @NonNull String str2) throws IOException;

    String getId();

    @Nullable
    String getToken();

    @NonNull
    Task<String> getTokenTask();
}
