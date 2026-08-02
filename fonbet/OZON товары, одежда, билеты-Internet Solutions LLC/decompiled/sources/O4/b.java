package O4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void A();

    @NotNull
    f C1(@NotNull String str);

    @NotNull
    Cursor G(@NotNull e eVar);

    void H1(@NotNull Object[] objArr) throws SQLException;

    void J();

    @NotNull
    Cursor N1(@NotNull String str);

    void O0(@NotNull String str) throws SQLException;

    boolean T1();

    boolean W1();

    @NotNull
    Cursor Y0(@NotNull e eVar, CancellationSignal cancellationSignal);

    int Z1(@NotNull ContentValues contentValues, Object[] objArr);

    void f1();

    void i1();

    boolean isOpen();
}
