package com.paypal.oslo.feature.wallet.graphql.selections;

@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0007R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0007R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0007R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0007R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0007R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0007R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0007R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0007R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0007R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0007R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0007R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0007R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0007R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0007R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0007R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0007R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0007R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0007R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0007R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0007R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0007R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0007R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0007R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0007R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0007R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0007R\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0007R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0007R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0007R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0007R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0007R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0007R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0007R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0007R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010\u0007R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0007R\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0007R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0007R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0007R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0007R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0007R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0007R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0007R\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0007R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0007R\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0007R\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0007R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0007R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0007R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0007R\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0007R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0007R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0007R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0007R\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0007R\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0007R\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0007R\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0007R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0007R\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0007R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0007R\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0007R\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0007R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u001b\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0007R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0007R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0007R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0007R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0007R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0007R\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0007R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0007R\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0007R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0007R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0007R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0007R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0007R\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0007R\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0007R\u001b\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0007R\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010\u0007R\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0007R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0007R\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0007R!\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010\u0007\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/selections/GetWalletComponentsQuerySelections;", "", "<init>", "()V", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "kernelID", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "validateRelationship", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "ICustomTabsServiceDefault", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getHighSpeedVideoSizes", "startTransaction", "getInputSizeshNQ4ISI", "requestGoOnline", "getHighSpeedVideoSizesFor", "release", "getOutputMinFrameDuration", "provide", "getOutputFormats", "getInputFormats", "sha1", "getOutputMinFrameDurationlomOqCM", "decode", "getOutputSizes", "prefetchWithMultipleUrls", "getOutputSizeshNQ4ISI", "freeTransaction", "getOutputStallDuration", "TransactionOutcomeDecoderExternalSyntheticLambda6", "getOutputStallDurationlomOqCM", "postMessage", "isOutputSupportedForhNQ4ISI", "rsaCipher", "isOutputSupportedFor", "free", "toString", "TransactionOutcomeDecoderExternalSyntheticLambda2", "unwrapAs", "newSession", "getValidOutputFormatsForInputhNQ4ISI", "newContext", "accessartificialFrame", "AMEXKernelProvider", "coroutineCreation", "isEngagementSignalsApiAvailable", "coroutineBoundary", "TransactionOutcomeDecoderExternalSyntheticLambda5", "CoroutineDebuggingKt", "setEngagementSignalsCallback", "ArtificialStackFrames", "IAuthTabCallbackStubProxy", "_BOUNDARY", "TransactionOutcomeDecoderExternalSyntheticLambda4", "a", util.h.xy.cb.b.f1091, "TransactionOutcomeDecoderExternalSyntheticLambda3", "getARTIFICIAL_FRAME_PACKAGE_NAME", "AMEXKernela", "_CREATION", "updateUI", "init", "ICustomTabsCallback", "d", "TransactionOutcomeDecoderExternalSyntheticLambda7", "kernelVersion", "IAuthTabCallbackDefault", "AMEXKernel", "requestPINEntry", "c", "extraCallbackWithResult", "resetTransaction", "IAuthTabCallback", "IAuthTabCallbackStub", "AMEXKernelCallback", "extraCallback", "exchange", "AMEXKernelJNI", "onActivityLayout", "BerTlvEncoder", "l", "asInterface", "onTransact", "TransactionOutcomeDecoderExternalSyntheticLambda0", "requestPostMessageChannelWithExtras", "ICustomTabsService", "setup", "ICustomTabsCallbackStub", "TransactionOutcomeDecoderExternalSyntheticLambda1", "version", "receiveFile", "TransactionOutcomeDecoder", "encode", "ICustomTabsServiceStub", "values", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "newAuthTabSession", "ICustomTabsCallbackStubProxy", "ICustomTabsServiceStubProxy", "onExtraCallback", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "mayLaunchUrl", "TransactionOutcomeDecodera", "warmup", "valueOf", "onNavigationEvent", "newSessionWithExtras", "getInterfaceVersion", "onWarmupCompleted", "ICustomTabsService_Parcel", "onExtraCallbackWithResult", "onPostMessage", "onUnminimized", "asBinder", "onGreatestScrollPercentageIncreased", "onMessageChannelReady", "ICustomTabsCallbackDefault", "onActivityResized", "updateVisuals", "onMinimized", "requestPostMessageChannel", "onRelationshipValidationResult", "IEngagementSignalsCallbackDefault", "extraCommand", "onSessionEnded", io.ktor.http.LinkHeader.Rel.Prefetch, "IEngagementSignalsCallback", "onVerticalScrollEvent", "__root", "get__root", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetWalletComponentsQuerySelections {
    public static final int $stable;

    /* renamed from: AMEXKernel, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onWarmupCompleted;

    /* renamed from: AMEXKernelCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> startTransaction;

    /* renamed from: AMEXKernelJNI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> requestPINEntry;

    /* renamed from: AMEXKernelProvider, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> coroutineCreation;

    /* renamed from: AMEXKernela, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> _CREATION;

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda6;

    /* renamed from: BerTlvEncoder, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> l;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsServiceStub;

    /* renamed from: CoroutineDebuggingKt, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onMessageChannelReady;

    /* renamed from: IAuthTabCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> release;

    /* renamed from: IAuthTabCallbackDefault, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> AMEXKernel;

    /* renamed from: IAuthTabCallbackStub, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> AMEXKernela;

    /* renamed from: IAuthTabCallbackStubProxy, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> _BOUNDARY;

    /* renamed from: ICustomTabsCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> d;

    /* renamed from: ICustomTabsCallbackDefault, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> extraCallback;

    /* renamed from: ICustomTabsCallbackStub, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> newContext;

    /* renamed from: ICustomTabsCallbackStubProxy, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoder;

    /* renamed from: ICustomTabsService, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> setup;

    /* renamed from: ICustomTabsServiceDefault, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRanges;

    /* renamed from: ICustomTabsServiceStub, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> kernelID;

    /* renamed from: ICustomTabsServiceStubProxy, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> decode;

    /* renamed from: ICustomTabsService_Parcel, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onExtraCallbackWithResult;

    /* renamed from: IEngagementSignalsCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> prefetchWithMultipleUrls;

    /* renamed from: IEngagementSignalsCallbackDefault, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsCallbackStubProxy;
    public static final com.paypal.oslo.feature.wallet.graphql.selections.GetWalletComponentsQuerySelections INSTANCE = new com.paypal.oslo.feature.wallet.graphql.selections.GetWalletComponentsQuerySelections();

    /* renamed from: TransactionOutcomeDecoder, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> encode;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda0, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> start;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda1, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> version;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda2, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> unwrapAs;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda3, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getARTIFICIAL_FRAME_PACKAGE_NAME;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda4, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> a;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda5, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> CoroutineDebuggingKt;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda6, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDurationlomOqCM;

    /* renamed from: TransactionOutcomeDecoderExternalSyntheticLambda7, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> kernelVersion;

    /* renamed from: TransactionOutcomeDecodera, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> warmup;

    /* renamed from: _BOUNDARY, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda0;

    /* renamed from: _CREATION, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onNavigationEvent;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> __root;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IEngagementSignalsCallbackDefault;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onActivityResized;

    /* renamed from: aid, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsService;

    /* renamed from: apply, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsServiceDefault;

    /* renamed from: asBinder, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> newSessionWithExtras;

    /* renamed from: asInterface, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> AMEXKernelJNI;

    /* renamed from: b, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> sha1;

    /* renamed from: c, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsServiceStubProxy;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isEngagementSignalsApiAvailable;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> valueOf;

    /* renamed from: d, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> newAuthTabSession;

    /* renamed from: decode, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizes;

    /* renamed from: encode, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> newSession;

    /* renamed from: exchange, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onVerticalScrollEvent;

    /* renamed from: extraCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> exchange;

    /* renamed from: extraCallbackWithResult, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> resetTransaction;

    /* renamed from: extraCommand, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsCallbackDefault;

    /* renamed from: free, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> toString;

    /* renamed from: freeTransaction, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputStallDuration;

    /* renamed from: getARTIFICIAL_FRAME_PACKAGE_NAME, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda3;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecodera;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onActivityLayout;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> setEngagementSignalsCallback;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda4;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda7;

    /* renamed from: getInterfaceVersion, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> postMessage;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> freeTransaction;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> validateRelationship;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> requestPostMessageChannelWithExtras;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onPostMessage;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> AMEXKernelCallback;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> BerTlvEncoder;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onExtraCallback;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onUnminimized;

    /* renamed from: init, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> receiveFile;

    /* renamed from: isEngagementSignalsApiAvailable, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> coroutineBoundary;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IAuthTabCallbackStubProxy;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsCallback;

    /* renamed from: kernelID, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoFpsRangesFor;

    /* renamed from: kernelVersion, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda5;

    /* renamed from: l, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> free;

    /* renamed from: mayLaunchUrl, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda2;

    /* renamed from: newAuthTabSession, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> TransactionOutcomeDecoderExternalSyntheticLambda1;

    /* renamed from: newContext, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> accessartificialFrame;

    /* renamed from: newSession, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: newSessionWithExtras, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInterfaceVersion;

    /* renamed from: onActivityLayout, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> updateUI;

    /* renamed from: onActivityResized, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onSessionEnded;

    /* renamed from: onExtraCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> apply;

    /* renamed from: onExtraCallbackWithResult, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> updateVisuals;

    /* renamed from: onGreatestScrollPercentageIncreased, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> asInterface;

    /* renamed from: onMessageChannelReady, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> extraCallbackWithResult;

    /* renamed from: onMinimized, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> mayLaunchUrl;

    /* renamed from: onNavigationEvent, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsService_Parcel;

    /* renamed from: onPostMessage, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IAuthTabCallbackDefault;

    /* renamed from: onRelationshipValidationResult, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> requestPostMessageChannel;

    /* renamed from: onSessionEnded, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> extraCommand;

    /* renamed from: onTransact, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> rsaCipher;

    /* renamed from: onUnminimized, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> asBinder;

    /* renamed from: onVerticalScrollEvent, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IEngagementSignalsCallback;

    /* renamed from: onWarmupCompleted, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onTransact;

    /* renamed from: postMessage, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedForhNQ4ISI;
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> prefetch;

    /* renamed from: prefetchWithMultipleUrls, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputSizeshNQ4ISI;

    /* renamed from: provide, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputFormats;

    /* renamed from: receiveFile, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> provide;

    /* renamed from: release, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDuration;

    /* renamed from: requestGoOnline, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizesFor;

    /* renamed from: requestPINEntry, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> c;

    /* renamed from: requestPostMessageChannel, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onRelationshipValidationResult;

    /* renamed from: requestPostMessageChannelWithExtras, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> AMEXKernelProvider;

    /* renamed from: resetTransaction, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> requestGoOnline;

    /* renamed from: rsaCipher, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> isOutputSupportedFor;

    /* renamed from: setEngagementSignalsCallback, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ArtificialStackFrames;

    /* renamed from: setup, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IAuthTabCallbackStub;

    /* renamed from: sha1, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getOutputMinFrameDurationlomOqCM;

    /* renamed from: start, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getHighSpeedVideoSizes;

    /* renamed from: startTransaction, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> getInputSizeshNQ4ISI;

    /* renamed from: toString, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> b;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> ICustomTabsCallbackStub;

    /* renamed from: updateUI, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> init;

    /* renamed from: updateVisuals, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onMinimized;

    /* renamed from: validateRelationship, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> Camera2StreamConfigurationMap;

    /* renamed from: valueOf, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> onGreatestScrollPercentageIncreased;

    /* renamed from: values, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> aid;

    /* renamed from: version, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> IAuthTabCallback;

    /* renamed from: warmup, reason: from kotlin metadata */
    private static final java.util.List<com.apollographql.apollo.api.CompiledSelection> values;

    private GetWalletComponentsQuerySelections() {
    }

    static {
        com.apollographql.apollo.api.CompiledField build = new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build();
        com.apollographql.apollo.api.CompiledField build2 = new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{build, build2});
        getHighSpeedVideoFpsRangesFor = listOf;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf).build()});
        Camera2StreamConfigurationMap = listOf2;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("accountInfoAvailable", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("prepaidStatus", com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("totalAvailableAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf2).build()});
        getHighResolutionOutputSizeshNQ4ISI = listOf3;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf4 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("balances", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Balances.INSTANCE.getType())).selections(listOf3).build());
        getHighSpeedVideoFpsRanges = listOf4;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf5 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf4).build());
        getHighSpeedVideoSizes = listOf5;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf6 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("eligibleCreditProductIdentifiers", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.getType())))).build());
        getInputSizeshNQ4ISI = listOf6;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf7 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("validityDuration", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.TimeDuration.INSTANCE.getType())).build());
        getHighSpeedVideoSizesFor = listOf7;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf8 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLApplyForPayLaterToGoPlan", kotlin.collections.CollectionsKt.listOf("BNPLApplyForPayLaterToGoPlan")).selections(listOf6).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLManageReadyToUsePlan", kotlin.collections.CollectionsKt.listOf("BNPLManageReadyToUsePlan")).selections(listOf7).build()});
        getOutputMinFrameDuration = listOf8;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf9 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getOutputFormats = listOf9;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf10 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf9).build()});
        getInputFormats = listOf10;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf11 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("amountDue", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf10).build(), new com.apollographql.apollo.api.CompiledField.Builder("dueDate", com.paypal.oslo.api.graphql.schema.type.DateNoTime.INSTANCE.getType()).build()});
        getOutputMinFrameDurationlomOqCM = listOf11;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf12 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getOutputSizes = listOf12;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf13 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf12).build()});
        getOutputSizeshNQ4ISI = listOf13;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf14 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("totalAmountDueThisWeek", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf13).build());
        getOutputStallDuration = listOf14;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf15 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getOutputStallDurationlomOqCM = listOf15;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf16 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf15).build()});
        isOutputSupportedForhNQ4ISI = listOf16;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf17 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("totalAmountDueToday", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf16).build());
        isOutputSupportedFor = listOf17;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf18 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("hasMultiplePendingPlans", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build());
        toString = listOf18;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf19 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        unwrapAs = listOf19;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf20 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf19).build()});
        getValidOutputFormatsForInputhNQ4ISI = listOf20;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf21 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("spendingPower", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf20).build());
        accessartificialFrame = listOf21;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf22 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("validityDuration", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.TimeDuration.INSTANCE.getType())).build());
        coroutineCreation = listOf22;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf23 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusDueOnSpecificDate", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusDueOnSpecificDate")).selections(listOf11).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusDueThisWeek", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusDueThisWeek")).selections(listOf14).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusDueToday", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusDueToday")).selections(listOf17).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusPending", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusPending")).selections(listOf18).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusPrequalified", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusPrequalified")).selections(listOf21).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLProfileStatusUnusedVirtualCard", kotlin.collections.CollectionsKt.listOf("BNPLProfileStatusUnusedVirtualCard")).selections(listOf22).build()});
        coroutineBoundary = listOf23;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf24 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        CoroutineDebuggingKt = listOf24;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf25 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf24).build()});
        ArtificialStackFrames = listOf25;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf26 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        _BOUNDARY = listOf26;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf27 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        a = listOf27;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf28 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf27).build()});
        b = listOf28;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf29 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        getARTIFICIAL_FRAME_PACKAGE_NAME = listOf29;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf30 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf29).build()});
        _CREATION = listOf30;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf31 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualLabel", com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantLogoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLProduct.INSTANCE.getType())).selections(listOf26).build(), new com.apollographql.apollo.api.CompiledField.Builder("currentPaymentDue", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf28).build(), new com.apollographql.apollo.api.CompiledField.Builder("nextPaymentDueAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf30).build(), new com.apollographql.apollo.api.CompiledField.Builder("nextPaymentDueDate", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.DateNoTime.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("isDueToday", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLBoolean.INSTANCE.getType())).build()});
        init = listOf31;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf32 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        d = listOf32;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf33 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        kernelVersion = listOf33;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf34 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf33).build()});
        AMEXKernel = listOf34;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf35 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualLabel", com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantLogoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLProduct.INSTANCE.getType())).selections(listOf32).build(), new com.apollographql.apollo.api.CompiledField.Builder("overdueAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf34).build()});
        c = listOf35;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf36 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        resetTransaction = listOf36;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf37 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        release = listOf37;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf38 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf37).build()});
        AMEXKernela = listOf38;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf39 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualLabel", com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantLogoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLProduct.INSTANCE.getType())).selections(listOf36).build(), new com.apollographql.apollo.api.CompiledField.Builder("overdueAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf38).build()});
        startTransaction = listOf39;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf40 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        exchange = listOf40;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf41 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualLabel", com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantLogoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLProduct.INSTANCE.getType())).selections(listOf40).build()});
        requestPINEntry = listOf41;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf42 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        updateUI = listOf42;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf43 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        l = listOf43;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf44 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf43).build()});
        AMEXKernelCallback = listOf44;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf45 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("contextualLabel", com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantLogoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("merchantName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLProduct.INSTANCE.getType())).selections(listOf42).build(), new com.apollographql.apollo.api.CompiledField.Builder("currentBalanceAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf44).build()});
        requestGoOnline = listOf45;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf46 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLOnTrackPlan", kotlin.collections.CollectionsKt.listOf("BNPLOnTrackPlan")).selections(listOf31).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLPastDuePlan", kotlin.collections.CollectionsKt.listOf("BNPLPastDuePlan")).selections(listOf35).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLDelinquentPlan", kotlin.collections.CollectionsKt.listOf("BNPLDelinquentPlan")).selections(listOf39).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLPendingPlan", kotlin.collections.CollectionsKt.listOf("BNPLPendingPlan")).selections(listOf41).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLAlmostCompletePlan", kotlin.collections.CollectionsKt.listOf("BNPLAlmostCompletePlan")).selections(listOf45).build()});
        sha1 = listOf46;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf47 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLPlan.INSTANCE.getType())))).selections(listOf46).build());
        AMEXKernelJNI = listOf47;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf48 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("totalRemainingBalance", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf25).build(), new com.apollographql.apollo.api.CompiledField.Builder("page", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BNPLPlansPage.INSTANCE.getType())).selections(listOf47).build()});
        rsaCipher = listOf48;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf49 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("nextBestAction", com.paypal.oslo.api.graphql.schema.type.BNPLNextBestAction.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.INSTANCE.get__nextBestAction_placementLocation()).value("OSLO_ACCOUNTS_ME_SURFACE").build())).selections(listOf8).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.BNPLProfileStatus.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.INSTANCE.get__status_placementLocation()).value("OSLO_ACCOUNTS_ME_SURFACE").build())).selections(listOf23).build(), new com.apollographql.apollo.api.CompiledField.Builder("plans", com.paypal.oslo.api.graphql.schema.type.BNPLPlans.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.INSTANCE.get__plans_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("filterOptions", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("plansCategory", com.payair.model.TokenStatusKt.TOKEN_ACTIVE), kotlin.TuplesKt.to("withAnyOfThePlanStatuses", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"DELINQUENT", "PAST_DUE", "ON_TRACK", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "ALMOST_COMPLETE"})), kotlin.TuplesKt.to("withAnyOfTheTags", kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER)), kotlin.TuplesKt.to("withCreditProductIdentifiers", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAY_LATER_US", "PAY_LATER_LONG_TERM_US"})), kotlin.TuplesKt.to("withNoneOfTheTags", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"FRAUD", "DECEASED", "BANKRUPTCY", "CHARGED_OFF"})))), kotlin.TuplesKt.to("limit", 3))).build())).selections(listOf48).build()});
        freeTransaction = listOf49;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf50 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("bnplProfilePresentation", com.paypal.oslo.api.graphql.schema.type.BNPLProfilePresentation.INSTANCE.getType()).selections(listOf49).build());
        free = listOf50;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf51 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        start = listOf51;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf52 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf51).build()});
        AMEXKernelProvider = listOf52;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf53 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("totalBalance", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf52).build());
        setup = listOf53;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf54 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("annualPercentageYield", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType())).build());
        newContext = listOf54;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf55 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        version = listOf55;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf56 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf55).build()});
        provide = listOf56;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf57 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        encode = listOf57;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf58 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf57).build()});
        BerTlvEncoder = listOf58;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf59 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("status", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.INSTANCE.getType())).build());
        kernelID = listOf59;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf60 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("targetAmount", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf56).build(), new com.apollographql.apollo.api.CompiledField.Builder("currentBalance", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf58).build(), new com.apollographql.apollo.api.CompiledField.Builder("transferSettings", com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettings.INSTANCE.getType()).selections(listOf59).build()});
        aid = listOf60;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf61 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Moneybox", kotlin.collections.CollectionsKt.listOf("Moneybox")).selections(listOf60).build()});
        TransactionOutcomeDecoderExternalSyntheticLambda0 = listOf61;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf62 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Moneybox.INSTANCE.getType())))).selections(listOf61).build());
        TransactionOutcomeDecoderExternalSyntheticLambda1 = listOf62;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf63 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("savingsAccount", com.paypal.oslo.api.graphql.schema.type.SavingsAccount.INSTANCE.getType()).selections(listOf53).build(), new com.apollographql.apollo.api.CompiledField.Builder("savingsAccountFeatures", com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeatures.INSTANCE.getType()).selections(listOf54).build(), new com.apollographql.apollo.api.CompiledField.Builder("savingsGoals", com.paypal.oslo.api.graphql.schema.type.Moneyboxes.INSTANCE.getType()).selections(listOf62).build()});
        TransactionOutcomeDecoder = listOf63;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf64 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("savings", com.paypal.oslo.api.graphql.schema.type.SavingsOverview.INSTANCE.getType()).selections(listOf63).build());
        decode = listOf64;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf65 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf64).build());
        apply = listOf65;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf66 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("businessName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        TransactionOutcomeDecoderExternalSyntheticLambda4 = listOf66;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf67 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("url", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build());
        TransactionOutcomeDecoderExternalSyntheticLambda6 = listOf67;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf68 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("name", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build());
        TransactionOutcomeDecoderExternalSyntheticLambda3 = listOf68;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf69 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.INSTANCE.getType())).build());
        TransactionOutcomeDecoderExternalSyntheticLambda2 = listOf69;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf70 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("bankName", com.paypal.oslo.api.graphql.schema.type.BusinessName.INSTANCE.getType()).selections(listOf66).build(), new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("nickname", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("type", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountType.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("institutionImages", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InstitutionImage.INSTANCE.getType()))).selections(listOf67).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccountIssuer.INSTANCE.getType())).selections(listOf68).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.BankAccountStatusInfo.INSTANCE.getType()).alias("CardStatus").selections(listOf69).build()});
        TransactionOutcomeDecoderExternalSyntheticLambda5 = listOf70;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf71 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccount.INSTANCE.getType())))).selections(listOf70).build());
        TransactionOutcomeDecodera = listOf71;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf72 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("bankAccounts", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.BankAccounts.INSTANCE.getType())).selections(listOf71).build());
        values = listOf72;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf73 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf72).build());
        IAuthTabCallback = listOf73;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf74 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("InstitutionImage", kotlin.collections.CollectionsKt.listOf("InstitutionImage")).selections(com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletInstitutionImageFragmentSelections.INSTANCE.get__root()).build()});
        valueOf = listOf74;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf75 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CardArt", kotlin.collections.CollectionsKt.listOf("CardArt")).selections(com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardArtFragmentSelections.INSTANCE.get__root()).build()});
        TransactionOutcomeDecoderExternalSyntheticLambda7 = listOf75;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf76 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CardIssuer", kotlin.collections.CollectionsKt.listOf("CardIssuer")).selections(com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardIssuerFragmentSelections.INSTANCE.get__root()).build()});
        onNavigationEvent = listOf76;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf77 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CardStatus.INSTANCE.getType())).build());
        getInterfaceVersion = listOf77;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf78 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD)).selections(com.paypal.oslo.feature.wallet.graphql.fragment.selections.WalletCardBasicInfoFragmentSelections.INSTANCE.get__root()).build(), new com.apollographql.apollo.api.CompiledField.Builder("institutionImages", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.InstitutionImage.INSTANCE.getType()))).selections(listOf74).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardArt", com.paypal.oslo.api.graphql.schema.type.CardArt.INSTANCE.getType()).selections(listOf75).build(), new com.apollographql.apollo.api.CompiledField.Builder("issuer", com.paypal.oslo.api.graphql.schema.type.CardIssuer.INSTANCE.getType()).selections(listOf76).build(), new com.apollographql.apollo.api.CompiledField.Builder("status", com.paypal.oslo.api.graphql.schema.type.CardStatusInfo.INSTANCE.getType()).selections(listOf77).build()});
        onWarmupCompleted = listOf78;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf79 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Card.INSTANCE.getType())))).selections(listOf78).build());
        onExtraCallback = listOf79;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf80 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("cards", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Cards.INSTANCE.getType())).selections(listOf79).build());
        onExtraCallbackWithResult = listOf80;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf81 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf80).build());
        IAuthTabCallbackStub = listOf81;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf82 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("pointsAvailable", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.LoyaltyRewardPoints.INSTANCE.getType())).build());
        IAuthTabCallbackDefault = listOf82;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf83 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("redeemablePointBalance", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalance.INSTANCE.getType())).selections(listOf82).build());
        asBinder = listOf83;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf84 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("rewardsOverview", com.paypal.oslo.api.graphql.schema.type.RewardsOverview.INSTANCE.getType()).selections(listOf83).build());
        asInterface = listOf84;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf85 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf84).build());
        onTransact = listOf85;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf86 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("quantity", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        onActivityLayout = listOf86;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf87 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLossFiatPercent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLossStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.INSTANCE.getType()).build()});
        ICustomTabsCallback = listOf87;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf88 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build()});
        IAuthTabCallbackStubProxy = listOf88;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf89 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("rate", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build());
        extraCallbackWithResult = listOf89;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf90 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("rewardApy", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardAPY.INSTANCE.getType()).selections(listOf89).build());
        extraCallback = listOf90;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf91 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("assetQuantity", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetQuantity.INSTANCE.getType()).selections(listOf86).build(), new com.apollographql.apollo.api.CompiledField.Builder("dailyGainOrLoss", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDailyGainOrLoss.INSTANCE.getType()).selections(listOf87).build(), new com.apollographql.apollo.api.CompiledField.Builder("assetName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("logoUrl", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("fiatAmount", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf88).build(), new com.apollographql.apollo.api.CompiledField.Builder("rewardHolding", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRewardHolding.INSTANCE.getType()).selections(listOf90).build()});
        onMessageChannelReady = listOf91;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf92 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossPercent", com.paypal.oslo.api.graphql.schema.type.Percentage.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("gainOrLossStatus", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.INSTANCE.getType()).build()});
        onActivityResized = listOf92;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf93 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        onMinimized = listOf93;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf94 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("gainOrLoss", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLoss.INSTANCE.getType()).selections(listOf92).build(), new com.apollographql.apollo.api.CompiledField.Builder("totalHolding", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf93).build()});
        onRelationshipValidationResult = listOf94;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf95 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("holdings", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHolding.INSTANCE.getType()))).selections(listOf91).build(), new com.apollographql.apollo.api.CompiledField.Builder("totalPortfolioValue", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyTotalPortfolioValue.INSTANCE.getType()).selections(listOf94).build()});
        onPostMessage = listOf95;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf96 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("cryptocurrencyHoldings", com.paypal.oslo.api.graphql.schema.type.CryptocurrencyHoldings.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.get__cryptocurrencyHoldings_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("gainOrLoss", bool), kotlin.TuplesKt.to("rewardHolding", bool))).build())).selections(listOf95).build());
        ICustomTabsCallbackStubProxy = listOf96;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf97 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf96).build());
        ICustomTabsService = listOf97;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf98 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("referenceUrl", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType())).build());
        onUnminimized = listOf98;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf99 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("front", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.MediaFile.INSTANCE.getType())).selections(listOf98).build());
        ICustomTabsCallbackDefault = listOf99;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf100 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("lastNChars", com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentLastNChars.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("smallImage", com.paypal.oslo.api.graphql.schema.type.DebitCardImage.INSTANCE.getType()).selections(listOf99).build()});
        ICustomTabsCallbackStub = listOf100;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf101 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("debitInstruments", com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentsOverview.INSTANCE.getType()))).selections(listOf100).build());
        extraCommand = listOf101;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf102 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf101).build());
        newSession = listOf102;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf103 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("backgroundColor", com.paypal.oslo.api.graphql.schema.type.HexColorCode.INSTANCE.getType()).build(), new com.apollographql.apollo.api.CompiledField.Builder("url", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build()});
        newAuthTabSession = listOf103;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf104 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("logoSmall", com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyProgramCardImage.INSTANCE.getType()).selections(listOf103).build());
        isEngagementSignalsApiAvailable = listOf104;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf105 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("imageUrls", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyProgramImageUrls.INSTANCE.getType())).selections(listOf104).build());
        mayLaunchUrl = listOf105;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf106 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("id", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("displayName", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("program", com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyProgram.INSTANCE.getType()).selections(listOf105).build()});
        receiveFile = listOf106;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf107 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCard.INSTANCE.getType())))).selections(listOf106).build());
        newSessionWithExtras = listOf107;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf108 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("page", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCardsPage.INSTANCE.getType())).selections(listOf107).build());
        prefetch = listOf108;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf109 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("thirdPartyLoyaltyCards", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.ThirdPartyLoyaltyCards.INSTANCE.getType())).selections(listOf108).build());
        prefetchWithMultipleUrls = listOf109;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf110 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.api.graphql.schema.type.Wallet.INSTANCE.getType()).selections(listOf109).build());
        postMessage = listOf110;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf111 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        requestPostMessageChannelWithExtras = listOf111;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf112 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build()});
        updateVisuals = listOf112;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf113 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currentBalance", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf111).build(), new com.apollographql.apollo.api.CompiledField.Builder("openToBuy", com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType()).selections(listOf112).build()});
        validateRelationship = listOf113;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf114 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("url", com.paypal.oslo.api.graphql.schema.type.URL.INSTANCE.getType()).build());
        setEngagementSignalsCallback = listOf114;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf115 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("cardDisplayLogo", com.paypal.oslo.api.graphql.schema.type.CreditImage.INSTANCE.getType()).selections(listOf114).build(), new com.apollographql.apollo.api.CompiledField.Builder("cardDisplayName", com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType()).build()});
        requestPostMessageChannel = listOf115;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf116 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditAccountId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CreditAccountID.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("billing", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingBilling.INSTANCE.getType()).selections(listOf113).build(), new com.apollographql.apollo.api.CompiledField.Builder("product", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingProduct.INSTANCE.getType()).selections(listOf115).build()});
        ICustomTabsServiceStub = listOf116;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf117 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("currencyCode", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.CurrencyCode.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build()});
        ICustomTabsServiceDefault = listOf117;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf118 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Money", kotlin.collections.CollectionsKt.listOf("Money")).selections(listOf117).build()});
        ICustomTabsServiceStubProxy = listOf118;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf119 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("minimumPaymentDue", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.Money.INSTANCE.getType())).selections(listOf118).build(), new com.apollographql.apollo.api.CompiledField.Builder("nextPaymentDueTime", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.DateTime.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("personalizationTrackingId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PersonalizationTrackingID.INSTANCE.getType())).build()});
        warmup = listOf119;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf120 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("personalizationTrackingId", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.PersonalizationTrackingID.INSTANCE.getType())).build());
        ICustomTabsService_Parcel = listOf120;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf121 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RevolvingCreditMinimumPaymentDue", kotlin.collections.CollectionsKt.listOf("RevolvingCreditMinimumPaymentDue")).selections(listOf119).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RevolvingCreditPastDue", kotlin.collections.CollectionsKt.listOf("RevolvingCreditPastDue")).selections(listOf120).build()});
        onVerticalScrollEvent = listOf121;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf122 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledField[]{new com.apollographql.apollo.api.CompiledField.Builder("creditProductIdentifier", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledField.Builder("account", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAccount.INSTANCE.getType()).selections(listOf116).build(), new com.apollographql.apollo.api.CompiledField.Builder("nextBestAction", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditOverviewNextBestActionDetails.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductOverview.INSTANCE.get__nextBestAction_input()).value(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("placementId", "OSLO_ACCOUNTS_L1_SCREEN"))).build())).selections(listOf121).build()});
        onSessionEnded = listOf122;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf123 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("revolvingCreditProductOverview", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductOverview.INSTANCE.getType()).selections(listOf122).build());
        onGreatestScrollPercentageIncreased = listOf123;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf124 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.apollographql.apollo.api.CompiledSelection[]{new com.apollographql.apollo.api.CompiledField.Builder("__typename", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.GraphQLString.INSTANCE.getType())).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BalanceComponent", kotlin.collections.CollectionsKt.listOf("BalanceComponent")).selections(listOf5).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BNPLComponent", kotlin.collections.CollectionsKt.listOf("BNPLComponent")).selections(listOf50).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("SavingsComponent", kotlin.collections.CollectionsKt.listOf("SavingsComponent")).selections(listOf65).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("BankAccountComponent", kotlin.collections.CollectionsKt.listOf("BankAccountComponent")).selections(listOf73).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CardComponent", kotlin.collections.CollectionsKt.listOf("CardComponent")).selections(listOf81).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RewardsComponent", kotlin.collections.CollectionsKt.listOf("RewardsComponent")).selections(listOf85).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CryptoComponent", kotlin.collections.CollectionsKt.listOf("CryptoComponent")).selections(listOf97).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DebitInstrumentsComponent", kotlin.collections.CollectionsKt.listOf("DebitInstrumentsComponent")).selections(listOf102).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ThirdPartyLoyaltyCardComponent", kotlin.collections.CollectionsKt.listOf("ThirdPartyLoyaltyCardComponent")).selections(listOf110).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RevolvingCreditCardComponent", kotlin.collections.CollectionsKt.listOf("RevolvingCreditCardComponent")).selections(listOf123).build()});
        IEngagementSignalsCallbackDefault = listOf124;
        java.util.List<com.apollographql.apollo.api.CompiledSelection> listOf125 = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("items", com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.apollographql.apollo.api.CompiledGraphQL.m9947list(com.apollographql.apollo.api.CompiledGraphQL.m9948notNull(com.paypal.oslo.api.graphql.schema.type.WalletComponent.INSTANCE.getType())))).selections(listOf124).build());
        IEngagementSignalsCallback = listOf125;
        __root = kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledField.Builder("walletComponents", com.paypal.oslo.api.graphql.schema.type.WalletComponents.INSTANCE.getType()).arguments(kotlin.collections.CollectionsKt.listOf(new com.apollographql.apollo.api.CompiledArgument.Builder(com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.get__walletComponents_input()).value(new com.apollographql.apollo.api.CompiledVariable("input")).build())).selections(listOf125).build());
        $stable = 8;
    }

    public final java.util.List<com.apollographql.apollo.api.CompiledSelection> get__root() {
        return __root;
    }
}
