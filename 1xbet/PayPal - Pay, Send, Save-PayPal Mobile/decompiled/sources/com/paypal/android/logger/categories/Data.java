package com.paypal.android.logger.categories;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/logger/categories/Data;", "", "<init>", "()V", "CacheCleared", "CacheExpired", "CacheHit", "CacheMiss", "DatabaseError", "DatabaseQuery", "DatabaseWrite", "FileOperation", "SyncCompleted", "SyncError", "SyncStarted", com.google.common.net.HttpHeaders.WARNING}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Data {
    public static final com.paypal.android.logger.categories.Data INSTANCE = new com.paypal.android.logger.categories.Data();

    private Data() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$CacheHit;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheHit implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Data.CacheHit INSTANCE = new com.paypal.android.logger.categories.Data.CacheHit();
        private static final java.lang.String id = "data.cache.hit";

        private CacheHit() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$CacheMiss;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheMiss implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Data.CacheMiss INSTANCE = new com.paypal.android.logger.categories.Data.CacheMiss();
        private static final java.lang.String id = "data.cache.miss";

        private CacheMiss() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$CacheExpired;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheExpired implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info {
        public static final com.paypal.android.logger.categories.Data.CacheExpired INSTANCE = new com.paypal.android.logger.categories.Data.CacheExpired();
        private static final java.lang.String id = "data.cache.expired";

        private CacheExpired() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$CacheCleared;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheCleared implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info {
        public static final com.paypal.android.logger.categories.Data.CacheCleared INSTANCE = new com.paypal.android.logger.categories.Data.CacheCleared();
        private static final java.lang.String id = "data.cache.cleared";

        private CacheCleared() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$DatabaseQuery;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DatabaseQuery implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Data.DatabaseQuery INSTANCE = new com.paypal.android.logger.categories.Data.DatabaseQuery();
        private static final java.lang.String id = "data.db.query";

        private DatabaseQuery() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$DatabaseWrite;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DatabaseWrite implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info {
        public static final com.paypal.android.logger.categories.Data.DatabaseWrite INSTANCE = new com.paypal.android.logger.categories.Data.DatabaseWrite();
        private static final java.lang.String id = "data.db.write";

        private DatabaseWrite() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$DatabaseError;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Error;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DatabaseError implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Error {
        public static final com.paypal.android.logger.categories.Data.DatabaseError INSTANCE = new com.paypal.android.logger.categories.Data.DatabaseError();
        private static final java.lang.String id = "data.db.error";

        private DatabaseError() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$SyncStarted;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SyncStarted implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info {
        public static final com.paypal.android.logger.categories.Data.SyncStarted INSTANCE = new com.paypal.android.logger.categories.Data.SyncStarted();
        private static final java.lang.String id = "data.sync.started";

        private SyncStarted() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$SyncCompleted;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SyncCompleted implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info {
        public static final com.paypal.android.logger.categories.Data.SyncCompleted INSTANCE = new com.paypal.android.logger.categories.Data.SyncCompleted();
        private static final java.lang.String id = "data.sync.completed";

        private SyncCompleted() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$SyncError;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Error;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SyncError implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Error {
        public static final com.paypal.android.logger.categories.Data.SyncError INSTANCE = new com.paypal.android.logger.categories.Data.SyncError();
        private static final java.lang.String id = "data.sync.error";

        private SyncError() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/logger/categories/Data$FileOperation;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "Lcom/paypal/android/logger/categories/LogLevelTag$Error;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FileOperation implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug, com.paypal.android.logger.categories.LogLevelTag.Error {
        public static final com.paypal.android.logger.categories.Data.FileOperation INSTANCE = new com.paypal.android.logger.categories.Data.FileOperation();
        private static final java.lang.String id = "data.file.operation";

        private FileOperation() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Data$Warning;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Warn;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Warning implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Warn {
        public static final com.paypal.android.logger.categories.Data.Warning INSTANCE = new com.paypal.android.logger.categories.Data.Warning();
        private static final java.lang.String id = "data.warning";

        private Warning() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }
}
