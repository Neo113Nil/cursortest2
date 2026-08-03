package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class PurchaseDataSource {
    private static final java.lang.String TAG = "bole";
    private final java.lang.String[] allColumns = {org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID, "user_id", "status"};
    private final java.lang.String[] allColumns_subs = {org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID, "user_id", org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_FROM, org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_TO, org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU};
    private android.database.sqlite.SQLiteDatabase database;
    private final org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper dbHelper;

    public enum PurchaseStatus {
        PAID,
        FULFILLED,
        UNAVAILABLE,
        UNKNOWN
    }

    public PurchaseDataSource(android.content.Context context) {
        this.dbHelper = new org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper(context);
    }

    public void open() throws android.database.SQLException {
        this.database = this.dbHelper.getWritableDatabase();
    }

    public void close() {
        this.dbHelper.close();
    }

    public void createPurchase(java.lang.String str, java.lang.String str2, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID, str);
        contentValues.put("user_id", str2);
        contentValues.put("status", purchaseStatus.toString());
        try {
            this.database.insertOrThrow(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, null, contentValues);
        } catch (android.database.SQLException unused) {
        }
    }

    private org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord cursorToPurchaseRecord(android.database.Cursor cursor) {
        org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord purchaseRecord = new org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord();
        purchaseRecord.setReceiptId(cursor.getString(cursor.getColumnIndex(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID)));
        purchaseRecord.setUserId(cursor.getString(cursor.getColumnIndex("user_id")));
        try {
            purchaseRecord.setStatus(org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.valueOf(cursor.getString(cursor.getColumnIndex("status"))));
        } catch (java.lang.Exception unused) {
            purchaseRecord.setStatus(org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.UNKNOWN);
        }
        return purchaseRecord;
    }

    public final org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord getPurchaseRecord(java.lang.String str, java.lang.String str2) {
        android.database.Cursor query = this.database.query(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, this.allColumns, "receipt_id = ?", new java.lang.String[]{str}, null, null, null);
        query.moveToFirst();
        if (query.isAfterLast()) {
            query.close();
            return null;
        }
        org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord cursorToPurchaseRecord = cursorToPurchaseRecord(query);
        query.close();
        if (cursorToPurchaseRecord.getUserId() == null || !cursorToPurchaseRecord.getUserId().equalsIgnoreCase(str2)) {
            return null;
        }
        return cursorToPurchaseRecord;
    }

    private org.cocos2dx.bole.amazon.iap.SubscriptionRecord cursorToSubscriptionRecord(android.database.Cursor cursor) {
        org.cocos2dx.bole.amazon.iap.SubscriptionRecord subscriptionRecord = new org.cocos2dx.bole.amazon.iap.SubscriptionRecord();
        subscriptionRecord.setAmazonReceiptId(cursor.getString(cursor.getColumnIndex(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID)));
        subscriptionRecord.setAmazonUserId(cursor.getString(cursor.getColumnIndex("user_id")));
        subscriptionRecord.setFrom(cursor.getLong(cursor.getColumnIndex(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_FROM)));
        subscriptionRecord.setTo(cursor.getLong(cursor.getColumnIndex(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_TO)));
        subscriptionRecord.setSku(cursor.getString(cursor.getColumnIndex(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU)));
        return subscriptionRecord;
    }

    public final java.util.List<org.cocos2dx.bole.amazon.iap.SubscriptionRecord> getSubscriptionRecords(java.lang.String str) {
        android.util.Log.d(TAG, "getSubscriptionRecord: userId (" + str + ")");
        android.database.Cursor query = this.database.query("subscriptions", this.allColumns_subs, "user_id = ?", new java.lang.String[]{str}, null, null, null);
        query.moveToFirst();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!query.isAfterLast()) {
            arrayList.add(cursorToSubscriptionRecord(query));
            query.moveToNext();
        }
        android.util.Log.d(TAG, "getSubscriptionRecord: found " + arrayList.size() + " records");
        query.close();
        return arrayList;
    }

    public boolean updatePurchaseStatus(java.lang.String str, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus2) {
        java.lang.String str2;
        java.lang.String[] strArr = {str};
        if (purchaseStatus == null) {
            str2 = "receipt_id = ?";
        } else {
            strArr = new java.lang.String[]{str, purchaseStatus.toString()};
            str2 = "receipt_id = ? and status = ?";
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", purchaseStatus2.toString());
        return this.database.update(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.TABLE_PURCHASES, contentValues, str2, strArr) > 0;
    }

    public void insertOrUpdateSubscriptionRecord(java.lang.String str, java.lang.String str2, long j, long j2, java.lang.String str3) {
        android.util.Log.d(TAG, "insertOrUpdateSubscriptionRecord: receiptId (" + str + "),userId (" + str2 + ")");
        android.database.Cursor query = this.database.query("subscriptions", this.allColumns_subs, "receipt_id = ? and date_to > 0", new java.lang.String[]{str}, null, null, null);
        int count = query.getCount();
        query.close();
        if (count > 0) {
            android.util.Log.w(TAG, "Record already in final state");
            return;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_RECEIPT_ID, str);
        contentValues.put("user_id", str2);
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_FROM, java.lang.Long.valueOf(j));
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_TO, java.lang.Long.valueOf(j2));
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU, str3);
        this.database.insertWithOnConflict("subscriptions", null, contentValues, 5);
    }

    public boolean cancelSubscription(java.lang.String str, long j) {
        android.util.Log.d(TAG, "cancelSubscription: receiptId (" + str + "), cancelDate:(" + j + ")");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_DATE_TO, java.lang.Long.valueOf(j));
        int update = this.database.update("subscriptions", contentValues, "receipt_id = ?", new java.lang.String[]{str});
        android.util.Log.d(TAG, "cancelSubscription: updated " + update);
        return update > 0;
    }
}
