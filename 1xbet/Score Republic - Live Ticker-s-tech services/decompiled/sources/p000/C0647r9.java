package p000;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647r9 extends AbstractC0125d4 {

    /* JADX INFO: renamed from: a */
    public final Integer f6739a;

    /* JADX INFO: renamed from: b */
    public final String f6740b;

    /* JADX INFO: renamed from: c */
    public final String f6741c;

    /* JADX INFO: renamed from: d */
    public final String f6742d;

    /* JADX INFO: renamed from: e */
    public final String f6743e;

    /* JADX INFO: renamed from: f */
    public final String f6744f;

    /* JADX INFO: renamed from: g */
    public final String f6745g;

    /* JADX INFO: renamed from: h */
    public final String f6746h;

    /* JADX INFO: renamed from: i */
    public final String f6747i;

    /* JADX INFO: renamed from: j */
    public final String f6748j;

    /* JADX INFO: renamed from: k */
    public final String f6749k;

    /* JADX INFO: renamed from: l */
    public final String f6750l;

    public C0647r9(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f6739a = num;
        this.f6740b = str;
        this.f6741c = str2;
        this.f6742d = str3;
        this.f6743e = str4;
        this.f6744f = str5;
        this.f6745g = str6;
        this.f6746h = str7;
        this.f6747i = str8;
        this.f6748j = str9;
        this.f6749k = str10;
        this.f6750l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0125d4)) {
            return false;
        }
        AbstractC0125d4 abstractC0125d4 = (AbstractC0125d4) obj;
        if (!this.f6739a.equals(((C0647r9) abstractC0125d4).f6739a)) {
            return false;
        }
        if (!this.f6740b.equals(((C0647r9) abstractC0125d4).f6740b)) {
            return false;
        }
        if (!this.f6741c.equals(((C0647r9) abstractC0125d4).f6741c)) {
            return false;
        }
        if (!this.f6742d.equals(((C0647r9) abstractC0125d4).f6742d)) {
            return false;
        }
        if (!this.f6743e.equals(((C0647r9) abstractC0125d4).f6743e)) {
            return false;
        }
        if (!this.f6744f.equals(((C0647r9) abstractC0125d4).f6744f)) {
            return false;
        }
        if (!this.f6745g.equals(((C0647r9) abstractC0125d4).f6745g)) {
            return false;
        }
        if (!this.f6746h.equals(((C0647r9) abstractC0125d4).f6746h)) {
            return false;
        }
        if (!this.f6747i.equals(((C0647r9) abstractC0125d4).f6747i)) {
            return false;
        }
        if (!this.f6748j.equals(((C0647r9) abstractC0125d4).f6748j)) {
            return false;
        }
        if (this.f6749k.equals(((C0647r9) abstractC0125d4).f6749k)) {
            return this.f6750l.equals(((C0647r9) abstractC0125d4).f6750l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6750l.hashCode() ^ ((((((((((((((((((((((this.f6739a.hashCode() ^ 1000003) * 1000003) ^ this.f6740b.hashCode()) * 1000003) ^ this.f6741c.hashCode()) * 1000003) ^ this.f6742d.hashCode()) * 1000003) ^ this.f6743e.hashCode()) * 1000003) ^ this.f6744f.hashCode()) * 1000003) ^ this.f6745g.hashCode()) * 1000003) ^ this.f6746h.hashCode()) * 1000003) ^ this.f6747i.hashCode()) * 1000003) ^ this.f6748j.hashCode()) * 1000003) ^ this.f6749k.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f6739a);
        sb.append(", model=");
        sb.append(this.f6740b);
        sb.append(", hardware=");
        sb.append(this.f6741c);
        sb.append(", device=");
        sb.append(this.f6742d);
        sb.append(", product=");
        sb.append(this.f6743e);
        sb.append(", osBuild=");
        sb.append(this.f6744f);
        sb.append(", manufacturer=");
        sb.append(this.f6745g);
        sb.append(", fingerprint=");
        sb.append(this.f6746h);
        sb.append(", locale=");
        sb.append(this.f6747i);
        sb.append(", country=");
        sb.append(this.f6748j);
        sb.append(", mccMnc=");
        sb.append(this.f6749k);
        sb.append(", applicationBuild=");
        return AbstractC0024an.m285h(sb, this.f6750l, "}");
    }
}
