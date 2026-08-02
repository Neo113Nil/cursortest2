package io.github.sabpaisaandroid.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b_\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B¯\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010,\u001a\u00020-\u0012\b\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020-HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0002\u0010TJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0004\u0010\u008b\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/HÆ\u0001¢\u0006\u0003\u0010\u008c\u0001J\n\u0010\u008d\u0001\u001a\u00020-HÖ\u0001J\u0017\u0010\u008e\u0001\u001a\u00030\u008f\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001HÖ\u0003J\n\u0010\u0092\u0001\u001a\u00020-HÖ\u0001J\n\u0010\u0093\u0001\u001a\u00020\u0003HÖ\u0001J\u001e\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020-HÖ\u0001R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00102R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00102R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00102R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00102R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00102R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0015\u0010.\u001a\u0004\u0018\u00010/¢\u0006\n\n\u0002\u0010U\u001a\u0004\bS\u0010TR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00102R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u00102R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u00102R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u00102R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00102R\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00102R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u00102R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u00102¨\u0006\u0099\u0001"}, d2 = {"Lio/github/sabpaisaandroid/models/CreditCardResponse;", "Landroid/os/Parcelable;", "signature", "", "appId", "orderAmount", "orderCurrency", "orderId", "orderNote", "customerName", "customerPhone", "customerEmail", "notifyUrl", "returnUrl", "paymentOption", "cardNumber", "cardHolder", "expMonth", "expYear", "cvv", "bankName", "bankUrl", "agrName", "paReq", "md", "termUrl", "tempStatus", "mid", "clientName", "clientCode", "clientTxnId", "sabpaisaTxnId", "epUrl", "udf1", "udf2", "udf3", "udf4", "udf5", "udf6", "udf7", "udf8", "udf9", "udf10", "errorMessage", "errorCode", "", "txnAmount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;)V", "getAgrName", "()Ljava/lang/String;", "getAppId", "getBankName", "getBankUrl", "getCardHolder", "getCardNumber", "getClientCode", "getClientName", "getClientTxnId", "getCustomerEmail", "getCustomerName", "getCustomerPhone", "getCvv", "getEpUrl", "getErrorCode", "()I", "getErrorMessage", "getExpMonth", "getExpYear", "getMd", "getMid", "getNotifyUrl", "getOrderAmount", "getOrderCurrency", "getOrderId", "getOrderNote", "getPaReq", "getPaymentOption", "getReturnUrl", "getSabpaisaTxnId", "getSignature", "getTempStatus", "getTermUrl", "getTxnAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUdf1", "getUdf10", "getUdf2", "getUdf3", "getUdf4", "getUdf5", "getUdf6", "getUdf7", "getUdf8", "getUdf9", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Double;)Lio/github/sabpaisaandroid/models/CreditCardResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "gatewayAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditCardResponse implements Parcelable {
    public static final Parcelable.Creator<CreditCardResponse> CREATOR = new a();
    private final String agrName;
    private final String appId;
    private final String bankName;
    private final String bankUrl;
    private final String cardHolder;
    private final String cardNumber;
    private final String clientCode;
    private final String clientName;
    private final String clientTxnId;
    private final String customerEmail;
    private final String customerName;
    private final String customerPhone;
    private final String cvv;
    private final String epUrl;
    private final int errorCode;
    private final String errorMessage;
    private final String expMonth;
    private final String expYear;
    private final String md;
    private final String mid;
    private final String notifyUrl;
    private final String orderAmount;
    private final String orderCurrency;
    private final String orderId;
    private final String orderNote;
    private final String paReq;
    private final String paymentOption;
    private final String returnUrl;
    private final String sabpaisaTxnId;
    private final String signature;
    private final String tempStatus;
    private final String termUrl;
    private final Double txnAmount;
    private final String udf1;
    private final String udf10;
    private final String udf2;
    private final String udf3;
    private final String udf4;
    private final String udf5;
    private final String udf6;
    private final String udf7;
    private final String udf8;
    private final String udf9;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditCardResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreditCardResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreditCardResponse[] newArray(int i) {
            return new CreditCardResponse[i];
        }
    }

    public CreditCardResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String bankName, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, int i, Double d) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        this.signature = str;
        this.appId = str2;
        this.orderAmount = str3;
        this.orderCurrency = str4;
        this.orderId = str5;
        this.orderNote = str6;
        this.customerName = str7;
        this.customerPhone = str8;
        this.customerEmail = str9;
        this.notifyUrl = str10;
        this.returnUrl = str11;
        this.paymentOption = str12;
        this.cardNumber = str13;
        this.cardHolder = str14;
        this.expMonth = str15;
        this.expYear = str16;
        this.cvv = str17;
        this.bankName = bankName;
        this.bankUrl = str18;
        this.agrName = str19;
        this.paReq = str20;
        this.md = str21;
        this.termUrl = str22;
        this.tempStatus = str23;
        this.mid = str24;
        this.clientName = str25;
        this.clientCode = str26;
        this.clientTxnId = str27;
        this.sabpaisaTxnId = str28;
        this.epUrl = str29;
        this.udf1 = str30;
        this.udf2 = str31;
        this.udf3 = str32;
        this.udf4 = str33;
        this.udf5 = str34;
        this.udf6 = str35;
        this.udf7 = str36;
        this.udf8 = str37;
        this.udf9 = str38;
        this.udf10 = str39;
        this.errorMessage = str40;
        this.errorCode = i;
        this.txnAmount = d;
    }

    /* renamed from: component1, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNotifyUrl() {
        return this.notifyUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPaymentOption() {
        return this.paymentOption;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCardHolder() {
        return this.cardHolder;
    }

    /* renamed from: component15, reason: from getter */
    public final String getExpMonth() {
        return this.expMonth;
    }

    /* renamed from: component16, reason: from getter */
    public final String getExpYear() {
        return this.expYear;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* renamed from: component18, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* renamed from: component19, reason: from getter */
    public final String getBankUrl() {
        return this.bankUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getAgrName() {
        return this.agrName;
    }

    /* renamed from: component21, reason: from getter */
    public final String getPaReq() {
        return this.paReq;
    }

    /* renamed from: component22, reason: from getter */
    public final String getMd() {
        return this.md;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTermUrl() {
        return this.termUrl;
    }

    /* renamed from: component24, reason: from getter */
    public final String getTempStatus() {
        return this.tempStatus;
    }

    /* renamed from: component25, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    /* renamed from: component26, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component27, reason: from getter */
    public final String getClientCode() {
        return this.clientCode;
    }

    /* renamed from: component28, reason: from getter */
    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    /* renamed from: component29, reason: from getter */
    public final String getSabpaisaTxnId() {
        return this.sabpaisaTxnId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderAmount() {
        return this.orderAmount;
    }

    /* renamed from: component30, reason: from getter */
    public final String getEpUrl() {
        return this.epUrl;
    }

    /* renamed from: component31, reason: from getter */
    public final String getUdf1() {
        return this.udf1;
    }

    /* renamed from: component32, reason: from getter */
    public final String getUdf2() {
        return this.udf2;
    }

    /* renamed from: component33, reason: from getter */
    public final String getUdf3() {
        return this.udf3;
    }

    /* renamed from: component34, reason: from getter */
    public final String getUdf4() {
        return this.udf4;
    }

    /* renamed from: component35, reason: from getter */
    public final String getUdf5() {
        return this.udf5;
    }

    /* renamed from: component36, reason: from getter */
    public final String getUdf6() {
        return this.udf6;
    }

    /* renamed from: component37, reason: from getter */
    public final String getUdf7() {
        return this.udf7;
    }

    /* renamed from: component38, reason: from getter */
    public final String getUdf8() {
        return this.udf8;
    }

    /* renamed from: component39, reason: from getter */
    public final String getUdf9() {
        return this.udf9;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOrderCurrency() {
        return this.orderCurrency;
    }

    /* renamed from: component40, reason: from getter */
    public final String getUdf10() {
        return this.udf10;
    }

    /* renamed from: component41, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component42, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component43, reason: from getter */
    public final Double getTxnAmount() {
        return this.txnAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOrderNote() {
        return this.orderNote;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final CreditCardResponse copy(String signature, String appId, String orderAmount, String orderCurrency, String orderId, String orderNote, String customerName, String customerPhone, String customerEmail, String notifyUrl, String returnUrl, String paymentOption, String cardNumber, String cardHolder, String expMonth, String expYear, String cvv, String bankName, String bankUrl, String agrName, String paReq, String md, String termUrl, String tempStatus, String mid, String clientName, String clientCode, String clientTxnId, String sabpaisaTxnId, String epUrl, String udf1, String udf2, String udf3, String udf4, String udf5, String udf6, String udf7, String udf8, String udf9, String udf10, String errorMessage, int errorCode, Double txnAmount) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        return new CreditCardResponse(signature, appId, orderAmount, orderCurrency, orderId, orderNote, customerName, customerPhone, customerEmail, notifyUrl, returnUrl, paymentOption, cardNumber, cardHolder, expMonth, expYear, cvv, bankName, bankUrl, agrName, paReq, md, termUrl, tempStatus, mid, clientName, clientCode, clientTxnId, sabpaisaTxnId, epUrl, udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10, errorMessage, errorCode, txnAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardResponse)) {
            return false;
        }
        CreditCardResponse creditCardResponse = (CreditCardResponse) other;
        return Intrinsics.areEqual(this.signature, creditCardResponse.signature) && Intrinsics.areEqual(this.appId, creditCardResponse.appId) && Intrinsics.areEqual(this.orderAmount, creditCardResponse.orderAmount) && Intrinsics.areEqual(this.orderCurrency, creditCardResponse.orderCurrency) && Intrinsics.areEqual(this.orderId, creditCardResponse.orderId) && Intrinsics.areEqual(this.orderNote, creditCardResponse.orderNote) && Intrinsics.areEqual(this.customerName, creditCardResponse.customerName) && Intrinsics.areEqual(this.customerPhone, creditCardResponse.customerPhone) && Intrinsics.areEqual(this.customerEmail, creditCardResponse.customerEmail) && Intrinsics.areEqual(this.notifyUrl, creditCardResponse.notifyUrl) && Intrinsics.areEqual(this.returnUrl, creditCardResponse.returnUrl) && Intrinsics.areEqual(this.paymentOption, creditCardResponse.paymentOption) && Intrinsics.areEqual(this.cardNumber, creditCardResponse.cardNumber) && Intrinsics.areEqual(this.cardHolder, creditCardResponse.cardHolder) && Intrinsics.areEqual(this.expMonth, creditCardResponse.expMonth) && Intrinsics.areEqual(this.expYear, creditCardResponse.expYear) && Intrinsics.areEqual(this.cvv, creditCardResponse.cvv) && Intrinsics.areEqual(this.bankName, creditCardResponse.bankName) && Intrinsics.areEqual(this.bankUrl, creditCardResponse.bankUrl) && Intrinsics.areEqual(this.agrName, creditCardResponse.agrName) && Intrinsics.areEqual(this.paReq, creditCardResponse.paReq) && Intrinsics.areEqual(this.md, creditCardResponse.md) && Intrinsics.areEqual(this.termUrl, creditCardResponse.termUrl) && Intrinsics.areEqual(this.tempStatus, creditCardResponse.tempStatus) && Intrinsics.areEqual(this.mid, creditCardResponse.mid) && Intrinsics.areEqual(this.clientName, creditCardResponse.clientName) && Intrinsics.areEqual(this.clientCode, creditCardResponse.clientCode) && Intrinsics.areEqual(this.clientTxnId, creditCardResponse.clientTxnId) && Intrinsics.areEqual(this.sabpaisaTxnId, creditCardResponse.sabpaisaTxnId) && Intrinsics.areEqual(this.epUrl, creditCardResponse.epUrl) && Intrinsics.areEqual(this.udf1, creditCardResponse.udf1) && Intrinsics.areEqual(this.udf2, creditCardResponse.udf2) && Intrinsics.areEqual(this.udf3, creditCardResponse.udf3) && Intrinsics.areEqual(this.udf4, creditCardResponse.udf4) && Intrinsics.areEqual(this.udf5, creditCardResponse.udf5) && Intrinsics.areEqual(this.udf6, creditCardResponse.udf6) && Intrinsics.areEqual(this.udf7, creditCardResponse.udf7) && Intrinsics.areEqual(this.udf8, creditCardResponse.udf8) && Intrinsics.areEqual(this.udf9, creditCardResponse.udf9) && Intrinsics.areEqual(this.udf10, creditCardResponse.udf10) && Intrinsics.areEqual(this.errorMessage, creditCardResponse.errorMessage) && this.errorCode == creditCardResponse.errorCode && Intrinsics.areEqual((Object) this.txnAmount, (Object) creditCardResponse.txnAmount);
    }

    public final String getAgrName() {
        return this.agrName;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getBankUrl() {
        return this.bankUrl;
    }

    public final String getCardHolder() {
        return this.cardHolder;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getClientCode() {
        return this.clientCode;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientTxnId() {
        return this.clientTxnId;
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public final String getCustomerPhone() {
        return this.customerPhone;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getEpUrl() {
        return this.epUrl;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getExpMonth() {
        return this.expMonth;
    }

    public final String getExpYear() {
        return this.expYear;
    }

    public final String getMd() {
        return this.md;
    }

    public final String getMid() {
        return this.mid;
    }

    public final String getNotifyUrl() {
        return this.notifyUrl;
    }

    public final String getOrderAmount() {
        return this.orderAmount;
    }

    public final String getOrderCurrency() {
        return this.orderCurrency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderNote() {
        return this.orderNote;
    }

    public final String getPaReq() {
        return this.paReq;
    }

    public final String getPaymentOption() {
        return this.paymentOption;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getSabpaisaTxnId() {
        return this.sabpaisaTxnId;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getTempStatus() {
        return this.tempStatus;
    }

    public final String getTermUrl() {
        return this.termUrl;
    }

    public final Double getTxnAmount() {
        return this.txnAmount;
    }

    public final String getUdf1() {
        return this.udf1;
    }

    public final String getUdf10() {
        return this.udf10;
    }

    public final String getUdf2() {
        return this.udf2;
    }

    public final String getUdf3() {
        return this.udf3;
    }

    public final String getUdf4() {
        return this.udf4;
    }

    public final String getUdf5() {
        return this.udf5;
    }

    public final String getUdf6() {
        return this.udf6;
    }

    public final String getUdf7() {
        return this.udf7;
    }

    public final String getUdf8() {
        return this.udf8;
    }

    public final String getUdf9() {
        return this.udf9;
    }

    public int hashCode() {
        String str = this.signature;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderAmount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderCurrency;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderNote;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customerName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.customerPhone;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.customerEmail;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.notifyUrl;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.returnUrl;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentOption;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cardNumber;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.cardHolder;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.expMonth;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.expYear;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cvv;
        int a2 = androidx.compose.runtime.collection.a.a((hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31, 31, this.bankName);
        String str18 = this.bankUrl;
        int hashCode17 = (a2 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.agrName;
        int hashCode18 = (hashCode17 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.paReq;
        int hashCode19 = (hashCode18 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.md;
        int hashCode20 = (hashCode19 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.termUrl;
        int hashCode21 = (hashCode20 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.tempStatus;
        int hashCode22 = (hashCode21 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.mid;
        int hashCode23 = (hashCode22 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.clientName;
        int hashCode24 = (hashCode23 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.clientCode;
        int hashCode25 = (hashCode24 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.clientTxnId;
        int hashCode26 = (hashCode25 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.sabpaisaTxnId;
        int hashCode27 = (hashCode26 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.epUrl;
        int hashCode28 = (hashCode27 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.udf1;
        int hashCode29 = (hashCode28 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.udf2;
        int hashCode30 = (hashCode29 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.udf3;
        int hashCode31 = (hashCode30 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.udf4;
        int hashCode32 = (hashCode31 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.udf5;
        int hashCode33 = (hashCode32 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.udf6;
        int hashCode34 = (hashCode33 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.udf7;
        int hashCode35 = (hashCode34 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.udf8;
        int hashCode36 = (hashCode35 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.udf9;
        int hashCode37 = (hashCode36 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.udf10;
        int hashCode38 = (hashCode37 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.errorMessage;
        int a3 = g.a(this.errorCode, (hashCode38 + (str40 == null ? 0 : str40.hashCode())) * 31, 31);
        Double d = this.txnAmount;
        return a3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "CreditCardResponse(signature=" + this.signature + ", appId=" + this.appId + ", orderAmount=" + this.orderAmount + ", orderCurrency=" + this.orderCurrency + ", orderId=" + this.orderId + ", orderNote=" + this.orderNote + ", customerName=" + this.customerName + ", customerPhone=" + this.customerPhone + ", customerEmail=" + this.customerEmail + ", notifyUrl=" + this.notifyUrl + ", returnUrl=" + this.returnUrl + ", paymentOption=" + this.paymentOption + ", cardNumber=" + this.cardNumber + ", cardHolder=" + this.cardHolder + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvv=" + this.cvv + ", bankName=" + this.bankName + ", bankUrl=" + this.bankUrl + ", agrName=" + this.agrName + ", paReq=" + this.paReq + ", md=" + this.md + ", termUrl=" + this.termUrl + ", tempStatus=" + this.tempStatus + ", mid=" + this.mid + ", clientName=" + this.clientName + ", clientCode=" + this.clientCode + ", clientTxnId=" + this.clientTxnId + ", sabpaisaTxnId=" + this.sabpaisaTxnId + ", epUrl=" + this.epUrl + ", udf1=" + this.udf1 + ", udf2=" + this.udf2 + ", udf3=" + this.udf3 + ", udf4=" + this.udf4 + ", udf5=" + this.udf5 + ", udf6=" + this.udf6 + ", udf7=" + this.udf7 + ", udf8=" + this.udf8 + ", udf9=" + this.udf9 + ", udf10=" + this.udf10 + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ", txnAmount=" + this.txnAmount + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.signature);
        parcel.writeString(this.appId);
        parcel.writeString(this.orderAmount);
        parcel.writeString(this.orderCurrency);
        parcel.writeString(this.orderId);
        parcel.writeString(this.orderNote);
        parcel.writeString(this.customerName);
        parcel.writeString(this.customerPhone);
        parcel.writeString(this.customerEmail);
        parcel.writeString(this.notifyUrl);
        parcel.writeString(this.returnUrl);
        parcel.writeString(this.paymentOption);
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.cardHolder);
        parcel.writeString(this.expMonth);
        parcel.writeString(this.expYear);
        parcel.writeString(this.cvv);
        parcel.writeString(this.bankName);
        parcel.writeString(this.bankUrl);
        parcel.writeString(this.agrName);
        parcel.writeString(this.paReq);
        parcel.writeString(this.md);
        parcel.writeString(this.termUrl);
        parcel.writeString(this.tempStatus);
        parcel.writeString(this.mid);
        parcel.writeString(this.clientName);
        parcel.writeString(this.clientCode);
        parcel.writeString(this.clientTxnId);
        parcel.writeString(this.sabpaisaTxnId);
        parcel.writeString(this.epUrl);
        parcel.writeString(this.udf1);
        parcel.writeString(this.udf2);
        parcel.writeString(this.udf3);
        parcel.writeString(this.udf4);
        parcel.writeString(this.udf5);
        parcel.writeString(this.udf6);
        parcel.writeString(this.udf7);
        parcel.writeString(this.udf8);
        parcel.writeString(this.udf9);
        parcel.writeString(this.udf10);
        parcel.writeString(this.errorMessage);
        parcel.writeInt(this.errorCode);
        Double d = this.txnAmount;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }
}
