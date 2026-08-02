package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/di/OsloDatabaseClassProvider;", "Lcom/paypal/oslo/core/persistence/db/di/DatabaseClassProvider;", "<init>", "()V", "Ljava/lang/Class;", "Landroidx/room/RoomDatabase;", "getDatabaseClass", "()Ljava/lang/Class;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OsloDatabaseClassProvider implements com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider
    public final java.lang.Class<? extends androidx.room.RoomDatabase> getDatabaseClass() {
        return com.paypal.oslo.core.persistence.db.impl.OsloDatabaseImpl.class;
    }
}
