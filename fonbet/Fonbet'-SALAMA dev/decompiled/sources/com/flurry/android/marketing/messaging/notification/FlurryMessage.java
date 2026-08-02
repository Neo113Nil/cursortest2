package com.flurry.android.marketing.messaging.notification;

import android.os.Parcel;
import android.os.Parcelable;
import e1.k;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FlurryMessage implements Parcelable {
    public static final Parcelable.Creator<FlurryMessage> CREATOR = new Z2.a(22);

    /* renamed from: A, reason: collision with root package name */
    public final String f10476A;

    /* renamed from: a, reason: collision with root package name */
    public final String f10477a;
    public HashMap<String, String> appData;

    /* renamed from: b, reason: collision with root package name */
    public final String f10478b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10479c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10480d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10481e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10482f;
    public HashMap<String, String> flurryData;
    public int notificationId;
    public String priority;

    /* renamed from: x, reason: collision with root package name */
    public final String f10483x;

    /* renamed from: y, reason: collision with root package name */
    public final String f10484y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10485z;

    public static class Builder {
        public HashMap<String, String> appData;
        public String body;
        public String clickAction;
        public String color;
        public HashMap<String, String> flurryData;
        public String from;
        public String icon;
        public int notificationId;
        public String priority;
        public long sentTime;
        public String sound;
        public String title;
        public String to;
        public int ttl;

        public FlurryMessage build() {
            return new FlurryMessage(this);
        }

        public Builder setAppData(HashMap<String, String> hashMap) {
            this.appData = hashMap;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setClickAction(String str) {
            this.clickAction = str;
            return this;
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder setFlurryData(HashMap<String, String> hashMap) {
            this.flurryData = hashMap;
            return this;
        }

        public Builder setFrom(String str) {
            this.from = str;
            return this;
        }

        public Builder setIcon(String str) {
            this.icon = str;
            return this;
        }

        public Builder setNotificationId(int i7) {
            this.notificationId = i7;
            return this;
        }

        public Builder setPriority(String str) {
            this.priority = str;
            return this;
        }

        public Builder setSentTime(long j) {
            this.sentTime = j;
            return this;
        }

        public Builder setSound(String str) {
            this.sound = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setTo(String str) {
            this.to = str;
            return this;
        }

        public Builder setTtl(int i7) {
            this.ttl = i7;
            return this;
        }
    }

    public FlurryMessage(Builder builder) {
        this.f10477a = builder.from;
        this.f10478b = builder.to;
        this.f10479c = builder.sentTime;
        this.f10480d = builder.ttl;
        this.f10481e = builder.title;
        this.f10482f = builder.body;
        this.f10483x = builder.icon;
        this.f10484y = builder.sound;
        this.f10485z = builder.color;
        this.f10476A = builder.clickAction;
        this.appData = builder.appData;
        this.flurryData = builder.flurryData;
        this.priority = builder.priority;
        this.notificationId = builder.notificationId;
    }

    public static void a(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final HashMap<String, String> getAppData() {
        return this.appData;
    }

    public final String getBody() {
        return this.f10482f;
    }

    public final String getClickAction() {
        return this.f10476A;
    }

    public final String getColor() {
        return this.f10485z;
    }

    public final HashMap<String, String> getFlurryData() {
        return this.flurryData;
    }

    public final String getFrom() {
        return this.f10477a;
    }

    public final String getIcon() {
        return this.f10483x;
    }

    public final int getNotificationId() {
        return this.notificationId;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final long getSentTime() {
        return this.f10479c;
    }

    public final String getSound() {
        return this.f10484y;
    }

    public final String getTitle() {
        return this.f10481e;
    }

    public final String getTo() {
        return this.f10478b;
    }

    public final int getTtl() {
        return this.f10480d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("From: ");
        sb.append(getFrom());
        sb.append("\nTo: ");
        sb.append(getTo());
        sb.append("\nFlurry Message Id: ");
        sb.append(getNotificationId());
        sb.append("\nSent Time: ");
        sb.append(getSentTime());
        sb.append("\nTtl: ");
        sb.append(getTtl());
        sb.append("\nTitle: ");
        sb.append(getTitle());
        sb.append("\nBody: ");
        sb.append(getBody());
        sb.append("\nIcon: ");
        sb.append(getIcon());
        sb.append("\nSound: ");
        sb.append(getSound());
        sb.append("\nColor: ");
        sb.append(getColor());
        sb.append("\nClick Action: ");
        sb.append(getClickAction());
        sb.append("\nPriority: ");
        sb.append(getPriority());
        sb.append("\nApp Data: ");
        sb.append(getAppData() == null ? "" : getAppData().toString());
        sb.append("\nFlurry Data: ");
        return k.i(sb, getFlurryData() != null ? getFlurryData().toString() : "", "\n");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10477a);
        parcel.writeString(this.f10478b);
        parcel.writeLong(this.f10479c);
        parcel.writeInt(this.f10480d);
        parcel.writeString(this.f10481e);
        parcel.writeString(this.f10482f);
        parcel.writeString(this.f10483x);
        parcel.writeString(this.f10484y);
        parcel.writeString(this.f10485z);
        parcel.writeString(this.f10476A);
        a(parcel, this.appData);
        a(parcel, this.flurryData);
        parcel.writeString(this.priority);
        parcel.writeInt(this.notificationId);
    }

    public FlurryMessage(Parcel parcel) {
        this.f10477a = parcel.readString();
        this.f10478b = parcel.readString();
        this.f10479c = parcel.readLong();
        this.f10480d = parcel.readInt();
        this.f10481e = parcel.readString();
        this.f10482f = parcel.readString();
        this.f10483x = parcel.readString();
        this.f10484y = parcel.readString();
        this.f10485z = parcel.readString();
        this.f10476A = parcel.readString();
        HashMap<String, String> hashMap = new HashMap<>();
        int readInt = parcel.readInt();
        for (int i7 = 0; i7 < readInt; i7++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        this.appData = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        int readInt2 = parcel.readInt();
        for (int i8 = 0; i8 < readInt2; i8++) {
            hashMap2.put(parcel.readString(), parcel.readString());
        }
        this.flurryData = hashMap2;
        this.priority = parcel.readString();
        this.notificationId = parcel.readInt();
    }
}
