package C2;

import android.net.http.ConnectionMigrationOptions;
import android.net.http.HttpException;
import android.view.inputmethod.SelectRangeGesture;

/* renamed from: C2.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C2728x {
    public static /* synthetic */ ConnectionMigrationOptions.Builder a() {
        return new ConnectionMigrationOptions.Builder();
    }

    public static /* bridge */ /* synthetic */ Class b() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean e(Exception exc) {
        return exc instanceof HttpException;
    }
}
