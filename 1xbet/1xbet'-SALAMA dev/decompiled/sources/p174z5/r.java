package p174z5;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface r {
    void clearClient();

    void finishAutofillContext(boolean z4);

    void hide();

    void requestAutofill();

    void sendAppPrivateCommand(String str, Bundle bundle);

    void setClient(int i7, n nVar);

    void setEditableSizeAndTransform(double d7, double d8, double[] dArr);

    void setEditingState(q qVar);

    void setPlatformViewClient(int i7, boolean z4);

    void show();
}
