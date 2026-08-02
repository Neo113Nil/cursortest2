package com.paypal.android.logger.categories;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/logger/categories/Network;", "", "<init>", "()V", "Call", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "ConnectivityLost", "ConnectivityRestored", "Error", "GraphQLMutation", "GraphQLQuery", "GraphQLSubscription", "Success", "Timeout"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Network {
    public static final com.paypal.android.logger.categories.Network INSTANCE = new com.paypal.android.logger.categories.Network();

    private Network() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$Call;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Call implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.Call INSTANCE = new com.paypal.android.logger.categories.Network.Call();
        private static final java.lang.String id = "network.call";

        private Call() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$Success;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.Success INSTANCE = new com.paypal.android.logger.categories.Network.Success();
        private static final java.lang.String id = "network.success";

        private Success() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$Error;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Error;", "Lcom/paypal/android/logger/categories/LogLevelTag$Warn;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Error, com.paypal.android.logger.categories.LogLevelTag.Warn {
        public static final com.paypal.android.logger.categories.Network.Error INSTANCE = new com.paypal.android.logger.categories.Network.Error();
        private static final java.lang.String id = "network.error";

        private Error() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/categories/Network$Timeout;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Warn;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Timeout implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Warn {
        public static final com.paypal.android.logger.categories.Network.Timeout INSTANCE = new com.paypal.android.logger.categories.Network.Timeout();
        private static final java.lang.String id = "network.timeout";

        private Timeout() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$ConnectivityLost;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Warn;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectivityLost implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Warn, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.ConnectivityLost INSTANCE = new com.paypal.android.logger.categories.Network.ConnectivityLost();
        private static final java.lang.String id = "network.connectivity.lost";

        private ConnectivityLost() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$ConnectivityRestored;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectivityRestored implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.ConnectivityRestored INSTANCE = new com.paypal.android.logger.categories.Network.ConnectivityRestored();
        private static final java.lang.String id = "network.connectivity.restored";

        private ConnectivityRestored() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$GraphQLQuery;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GraphQLQuery implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.GraphQLQuery INSTANCE = new com.paypal.android.logger.categories.Network.GraphQLQuery();
        private static final java.lang.String id = "network.graphql.query";

        private GraphQLQuery() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$GraphQLMutation;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GraphQLMutation implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.GraphQLMutation INSTANCE = new com.paypal.android.logger.categories.Network.GraphQLMutation();
        private static final java.lang.String id = "network.graphql.mutation";

        private GraphQLMutation() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$GraphQLSubscription;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GraphQLSubscription implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.GraphQLSubscription INSTANCE = new com.paypal.android.logger.categories.Network.GraphQLSubscription();
        private static final java.lang.String id = "network.graphql.subscription";

        private GraphQLSubscription() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/logger/categories/Network$Configuration;", "Lcom/paypal/android/logger/categories/LogCategory;", "Lcom/paypal/android/logger/categories/LogLevelTag$Info;", "Lcom/paypal/android/logger/categories/LogLevelTag$Debug;", "<init>", "()V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Configuration implements com.paypal.android.logger.categories.LogCategory, com.paypal.android.logger.categories.LogLevelTag.Info, com.paypal.android.logger.categories.LogLevelTag.Debug {
        public static final com.paypal.android.logger.categories.Network.Configuration INSTANCE = new com.paypal.android.logger.categories.Network.Configuration();
        private static final java.lang.String id = "network.configuration";

        private Configuration() {
        }

        @Override // com.paypal.android.logger.categories.LogCategory
        public final java.lang.String getId() {
            return id;
        }
    }
}
