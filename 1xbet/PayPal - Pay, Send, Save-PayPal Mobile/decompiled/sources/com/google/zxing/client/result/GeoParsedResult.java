package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class GeoParsedResult extends com.google.zxing.client.result.ParsedResult {
    private final double altitude;
    private final double latitude;
    private final double longitude;
    private final java.lang.String query;

    GeoParsedResult(double d, double d2, double d3, java.lang.String str) {
        super(com.google.zxing.client.result.ParsedResultType.GEO);
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.query = str;
    }

    public final java.lang.String getGeoURI() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("geo:");
        sb.append(this.latitude);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.longitude);
        if (this.altitude > 0.0d) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb.append(this.altitude);
        }
        if (this.query != null) {
            sb.append('?');
            sb.append(this.query);
        }
        return sb.toString();
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final java.lang.String getQuery() {
        return this.query;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final java.lang.String getDisplayResult() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        sb.append(this.latitude);
        sb.append(", ");
        sb.append(this.longitude);
        if (this.altitude > 0.0d) {
            sb.append(", ");
            sb.append(this.altitude);
            sb.append(io.ktor.util.date.GMTDateParser.MINUTES);
        }
        if (this.query != null) {
            sb.append(" (");
            sb.append(this.query);
            sb.append(')');
        }
        return sb.toString();
    }
}
