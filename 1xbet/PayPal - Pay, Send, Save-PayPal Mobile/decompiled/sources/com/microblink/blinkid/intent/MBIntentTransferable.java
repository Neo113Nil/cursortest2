package com.microblink.blinkid.intent;

/* loaded from: classes10.dex */
public interface MBIntentTransferable extends android.os.Parcelable {
    void clearSavedState();

    boolean existsInIntent(android.content.Intent intent);

    void loadFromIntent(android.content.Intent intent);

    void saveState();

    void saveToIntent(android.content.Intent intent);
}
