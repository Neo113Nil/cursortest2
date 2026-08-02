package com.amplitude.android.migration;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.core.app.NotificationCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g extends SQLiteOpenHelper {
    public final com.amplitude.common.a a;
    public final File b;
    public boolean c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String databaseName, com.amplitude.common.a logger) {
        super(context, databaseName, (SQLiteDatabase.CursorFactory) null, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = logger;
        File databasePath = context.getDatabasePath(databaseName);
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        this.b = databasePath;
        this.c = true;
        this.d = 4;
    }

    public static void l(RuntimeException runtimeException) {
        boolean startsWith$default;
        boolean startsWith$default2;
        String message = runtimeException.getMessage();
        if (message == null) {
            throw runtimeException;
        }
        if (message.length() == 0) {
            throw runtimeException;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(message, "Cursor window allocation of", false, 2, null);
        if (!startsWith$default) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(message, "Could not allocate CursorWindow", false, 2, null);
            if (!startsWith$default2) {
                throw runtimeException;
            }
        }
        throw new f(message);
    }

    public final synchronized void H(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        W(key);
    }

    public final void W(String str) {
        try {
            try {
                getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
            } catch (SQLiteException e) {
                com.amplitude.common.android.b.Companion.getClass();
                com.amplitude.common.android.b.b.b("remove value from long_store failed: " + e.getMessage());
                d();
            } catch (StackOverflowError e2) {
                com.amplitude.common.android.b.Companion.getClass();
                com.amplitude.common.android.b.b.b("remove value from long_store failed: " + e2.getMessage());
                d();
            }
        } finally {
            close();
        }
    }

    public final void d() {
        try {
            close();
        } catch (Exception e) {
            com.amplitude.common.android.b.Companion.getClass();
            com.amplitude.common.android.b.b.b("close failed: " + e.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.c = false;
        this.a.b("Attempt to re-create existing legacy database file " + this.b.getAbsolutePath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.d = i;
    }

    public final synchronized Long q(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Long) t("long_store", key);
    }

    public final synchronized String s(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) t("store", key);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r14 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r14 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, String str2) {
        Throwable th;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        Cursor cursor;
        String str3;
        StackOverflowError stackOverflowError;
        SQLiteException sQLiteException;
        ?? r3 = 0;
        Object obj = null;
        try {
            if (this.b.exists()) {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        if (!this.c) {
                            close();
                            return null;
                        }
                        Intrinsics.checkNotNull(readableDatabase);
                        str3 = str;
                        try {
                            cursor = readableDatabase.query(str3, new String[]{Constants.KEY, "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                        } catch (SQLiteException e) {
                            e = e;
                            sQLiteException = e;
                            cursor = null;
                            com.amplitude.common.android.b.Companion.getClass();
                            com.amplitude.common.android.b.b.b("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                            d();
                        } catch (StackOverflowError e2) {
                            e = e2;
                            stackOverflowError = e;
                            cursor = null;
                            com.amplitude.common.android.b.Companion.getClass();
                            com.amplitude.common.android.b.b.b("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            d();
                            if (cursor != null) {
                                cursor.close();
                            }
                            close();
                            return null;
                        }
                        try {
                            Intrinsics.checkNotNull(cursor);
                            if (cursor.moveToFirst()) {
                                obj = Intrinsics.areEqual(str3, "store") ? cursor.getString(1) : Long.valueOf(cursor.getLong(1));
                            }
                            cursor.close();
                            close();
                            return obj;
                        } catch (SQLiteException e3) {
                            sQLiteException = e3;
                            com.amplitude.common.android.b.Companion.getClass();
                            com.amplitude.common.android.b.b.b("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                            d();
                        } catch (IllegalStateException e4) {
                            illegalStateException = e4;
                            u(illegalStateException);
                        } catch (RuntimeException e5) {
                            runtimeException = e5;
                            l(runtimeException);
                            throw null;
                        } catch (StackOverflowError e6) {
                            stackOverflowError = e6;
                            com.amplitude.common.android.b.Companion.getClass();
                            com.amplitude.common.android.b.b.b("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            d();
                            if (cursor != null) {
                            }
                            close();
                            return null;
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        str3 = str;
                    } catch (StackOverflowError e8) {
                        e = e8;
                        str3 = str;
                    }
                } catch (IllegalStateException e9) {
                    illegalStateException = e9;
                    cursor = null;
                } catch (RuntimeException e10) {
                    runtimeException = e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (r3 != 0) {
                        r3.close();
                    }
                    close();
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r3 = str;
        }
    }

    public final void u(IllegalStateException illegalStateException) {
        boolean contains$default;
        boolean contains$default2;
        String message = illegalStateException.getMessage();
        if (message == null) {
            throw illegalStateException;
        }
        if (message.length() == 0) {
            throw illegalStateException;
        }
        contains$default = StringsKt__StringsKt.contains$default(message, "Couldn't read", false, 2, (Object) null);
        if (!contains$default) {
            throw illegalStateException;
        }
        contains$default2 = StringsKt__StringsKt.contains$default(message, "CursorWindow", false, 2, (Object) null);
        if (!contains$default2) {
            throw illegalStateException;
        }
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractList x(String str) {
        RuntimeException runtimeException;
        Cursor cursor;
        String str2;
        Throwable th;
        if (!this.b.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor2 = null;
        try {
            try {
                try {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    if (!this.c) {
                        ArrayList arrayList = new ArrayList();
                        close();
                        return arrayList;
                    }
                    Intrinsics.checkNotNull(readableDatabase);
                    str2 = str;
                    try {
                        Cursor query = readableDatabase.query(str2, new String[]{"id", NotificationCompat.CATEGORY_EVENT}, null, null, null, null, "id ASC", null);
                        while (true) {
                            try {
                                Intrinsics.checkNotNull(query);
                                if (!query.moveToNext()) {
                                    query.close();
                                    close();
                                    return linkedList;
                                }
                                long j = query.getLong(0);
                                String string = query.getString(1);
                                if (string != null && string.length() != 0) {
                                    JSONObject jSONObject = new JSONObject(string);
                                    jSONObject.put("$rowId", j);
                                    linkedList.add(jSONObject);
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                cursor2 = query;
                                com.amplitude.common.android.b.Companion.getClass();
                                com.amplitude.common.android.b.b.b("read events from " + str2 + " failed: " + e.getMessage());
                                d();
                            } catch (IllegalStateException e2) {
                                e = e2;
                                cursor2 = query;
                                u(e);
                            } catch (RuntimeException e3) {
                                cursor = query;
                                runtimeException = e3;
                                try {
                                    l(runtimeException);
                                    throw null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    close();
                                    throw th;
                                }
                            } catch (StackOverflowError e4) {
                                e = e4;
                                cursor2 = query;
                                com.amplitude.common.android.b.Companion.getClass();
                                com.amplitude.common.android.b.b.b("read events from " + str2 + " failed: " + e.getMessage());
                                d();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = query;
                                th = th;
                                if (cursor2 != null) {
                                }
                                close();
                                throw th;
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                    } catch (StackOverflowError e6) {
                        e = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLiteException e7) {
                e = e7;
                str2 = str;
            } catch (StackOverflowError e8) {
                e = e8;
                str2 = str;
            }
        } catch (IllegalStateException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            runtimeException = e10;
            cursor = null;
        }
    }

    public final void y(long j, String str) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j)});
                } catch (StackOverflowError e) {
                    com.amplitude.common.android.b.Companion.getClass();
                    com.amplitude.common.android.b.b.b("remove events from " + str + " failed: " + e.getMessage());
                    d();
                }
            } catch (SQLiteException e2) {
                com.amplitude.common.android.b.Companion.getClass();
                com.amplitude.common.android.b.b.b("remove events from " + str + " failed: " + e2.getMessage());
                d();
            }
        } finally {
            close();
        }
    }
}
