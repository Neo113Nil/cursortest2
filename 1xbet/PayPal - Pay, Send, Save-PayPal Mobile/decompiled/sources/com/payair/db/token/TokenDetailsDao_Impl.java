package com.payair.db.token;

/* loaded from: classes10.dex */
public final class TokenDetailsDao_Impl implements com.payair.db.token.TokenDetailsDao {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.RoomDatabase f4362a;
    public final com.payair.db.token.c b;
    public final com.payair.db.Converters c = new com.payair.db.Converters();
    public final com.payair.db.token.d d;
    public final com.payair.db.token.e e;
    public final com.payair.db.token.f f;

    public TokenDetailsDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.f4362a = roomDatabase;
        this.b = new com.payair.db.token.c(this, roomDatabase);
        this.d = new com.payair.db.token.d(roomDatabase);
        this.e = new com.payair.db.token.e(roomDatabase);
        this.f = new com.payair.db.token.f(roomDatabase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.payair.model.TokenStatus a(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -2026521607:
                if (str.equals(com.payair.model.TokenStatusKt.TOKEN_DELETED)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 382849616:
                if (str.equals(com.payair.model.TokenStatusKt.TOKEN_DEACTIVATED)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case com.daon.face.quality.DaonFaceQualityException.ERR_UNKNOWN /* 433141802 */:
                if (str.equals("UNKNOWN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 807292011:
                if (str.equals(com.payair.model.TokenStatusKt.TOKEN_INACTIVE)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1124965819:
                if (str.equals("SUSPENDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1350822958:
                if (str.equals("DECLINED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1925346054:
                if (str.equals(com.payair.model.TokenStatusKt.TOKEN_ACTIVE)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return com.payair.model.TokenStatus.DELETED;
            case 1:
                return com.payair.model.TokenStatus.DEACTIVATED;
            case 2:
                return com.payair.model.TokenStatus.UNKNOWN;
            case 3:
                return com.payair.model.TokenStatus.INACTIVE;
            case 4:
                return com.payair.model.TokenStatus.SUSPENDED;
            case 5:
                return com.payair.model.TokenStatus.DECLINED;
            case 6:
                return com.payair.model.TokenStatus.ACTIVE;
            default:
                throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.EMPTY_LIST;
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object delete(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4362a, true, new com.payair.db.token.h(this, tokenDetailsEntry), continuation);
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final void deleteAll() {
        this.f4362a.assertNotSuspendingTransaction();
        androidx.database.db.SupportSQLiteStatement acquire = this.f.acquire();
        try {
            this.f4362a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.f4362a.setTransactionSuccessful();
            } finally {
                this.f4362a.endTransaction();
            }
        } finally {
            this.f.release(acquire);
        }
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.token.TokenDetailsEntry>> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM TokenDetails", 0);
        return androidx.room.CoroutinesRoom.execute(this.f4362a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.token.j(this, acquire), continuation);
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object getByNetworkTokenReference(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.db.token.TokenDetailsEntry> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM TokenDetails WHERE networkTokenReference = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return androidx.room.CoroutinesRoom.execute(this.f4362a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.token.a(this, acquire), continuation);
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object insert(com.payair.db.token.TokenDetailsEntry[] tokenDetailsEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4362a, true, new com.payair.db.token.g(this, tokenDetailsEntryArr), continuation);
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.token.TokenDetailsEntry>> observeAll() {
        return androidx.room.CoroutinesRoom.createFlow(this.f4362a, false, new java.lang.String[]{"TokenDetails"}, new com.payair.db.token.k(this, androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM TokenDetails", 0)));
    }

    @Override // com.payair.db.token.TokenDetailsDao
    public final java.lang.Object delete(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4362a, true, new com.payair.db.token.i(this, str), continuation);
    }
}
